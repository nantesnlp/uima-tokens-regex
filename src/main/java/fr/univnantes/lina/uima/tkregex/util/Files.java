package fr.univnantes.lina.uima.tkregex.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import fr.univnantes.lina.uima.tkregex.antlr.AutomataParsingException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class Files {

	public static final String TAB = "\t";

	public static Set<String> loadTsv(URL url, int column) throws IOException {
		return loadLines(url).stream()
				.map(line -> line.split(TAB))
				.filter(values -> values.length > column)
				.map(values -> values[column])
				.filter(v -> !v.trim().isEmpty())
				.collect(Collectors.toSet());
	}

	private static Deque<String> toPath(String keyPath) {
		return new LinkedList<>(Splitter.on(".").splitToList(keyPath));
	}

	public static Set<String> loadJson(URL url, String keyPath) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new JsonFactory());
		JsonNode node = mapper.readTree(url);
		return toSet(node,toPath(keyPath), url, "JSON", keyPath);
	}

	public static Set<String> loadYaml(URL url, String keyPath) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		JsonNode node = mapper.readTree(url);
		return toSet(node, toPath(keyPath), url, "YAML", keyPath);
	}

	private static Set<String> toSet(JsonNode node, Deque<String> keyPathList, URL url, String type, String keyPath) {
		Preconditions.checkArgument(keyPathList.size() > 0);
		String currentPath = keyPathList.pop();
		JsonNode rootNode = node.get( currentPath);
		if(rootNode == null) {
			throw new AutomataParsingException(String.format("No node found at path %s for %s file %s (current subpath: %s)",
					keyPath, type, url,currentPath));
		}
		if(keyPathList.isEmpty()) {
			return leafToSet(rootNode, url, type, keyPath);
		} else {
			return toSet(rootNode, keyPathList, url, type, keyPath);
		}
	}

	private static class NotAnArrayException extends RuntimeException {
		private String keyPath;
		private URL url;
		private String type;
		private JsonNodeType nodeType;

		public NotAnArrayException(String keyPath, URL url, String type, JsonNodeType nodeType) {
			this.keyPath = keyPath;
			this.url = url;
			this.type = type;
			this.nodeType=nodeType;
		}

		@Override
		public String getMessage() {
			return String.format("Element at path %s in %s file %s must be an array. Got: %s", keyPath, type, url, nodeType);
		}
	}
	private static Set<String> leafToSet(JsonNode jsonNode, URL url, String type, String keyPath) {
		if(jsonNode.getNodeType() != JsonNodeType.ARRAY) {
			throw new NotAnArrayException(keyPath, url, type, jsonNode.getNodeType());
		}
		Set<String> values = new HashSet<>();
		for(int i=0; i<((ArrayNode)jsonNode).size(); i++) {
			JsonNode valueNode = ((ArrayNode) jsonNode).get(i);
			values.add(valueNode.asText());
		}
		return values;
	}

	public static Set<String> loadLines(URL url) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		Set<String> lines = new HashSet<>();
		while((line = br.readLine()) != null) {
			line = line
					.replaceFirst("#.*$", "");
			if(line.trim().isEmpty())
				continue;
			else
				lines.add(line);
		}
		return lines;
	}
}
