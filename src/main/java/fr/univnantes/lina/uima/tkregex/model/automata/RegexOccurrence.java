/*******************************************************************************
 * Copyright 2015-2017 - CNRS (Centre National de Recherche Scientifique)
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *******************************************************************************/
package fr.univnantes.lina.uima.tkregex.model.automata;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import fr.univnantes.lina.uima.tkregex.model.matchers.LabelledAnnotation;

import java.util.Iterator;
import java.util.List;

public class RegexOccurrence {
	public static final char WHITESPACE = ' ';

	private Rule rule;
	private AutomatonEngine automaton;
	private String category;
	private List<LabelledAnnotation> allMatchingAnnotations;
	private List<LabelledAnnotation> labelledAnnotations;
	private List<String> labels;
	private LabelledAnnotation last = null;
	private int size;
	private int begin = -1;
	private int end = -1;
	private int automatonInstanceId;

	RegexOccurrence(AutomatonEngine automatonEngine, Iterable<LabelledAnnotation> list) {
		super();
		this.automaton = automatonEngine;
		this.allMatchingAnnotations = ImmutableList.copyOf(list);
		this.labelledAnnotations = ImmutableList.copyOf(labelledAnnotationIterator());
		this.size = this.labelledAnnotations.size();
		if(size > 0) {
			this.last = this.labelledAnnotations.get(size - 1);
			this.begin = this.labelledAnnotations.get(0).getAnnotation().getBegin();
			this.end = this.last.getAnnotation().getEnd();
		}
		this.labels =  Lists.newArrayListWithCapacity(this.size);
		final Iterator<LabelledAnnotation> it = this.labelledAnnotations.iterator();
		while(it.hasNext()) {
			LabelledAnnotation la = it.next();
			labels.add(la.getLabel() == null ? la.getAnnotation().getCoveredText() : la.getLabel());
		}
		if(end < begin)
			throw new IllegalArgumentException("end < begin");
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
	void setCategory(String category) {
		this.category = category;
	}
	
	public LabelledAnnotation getLast() {
		return last;
	}

	public String getCategory() {
		return category;
	}

	private Iterator<LabelledAnnotation> labelledAnnotationIterator() {
		final Iterator<LabelledAnnotation> it = this.allMatchingAnnotations.iterator();
		return new AbstractIterator<LabelledAnnotation>() {
			@Override
			protected LabelledAnnotation computeNext() {
				while(it.hasNext()) {
					LabelledAnnotation la = it.next();
					if(!la.isIgnored())
						return la;
				}
				return endOfData();
			}
		};
	}


	public List<LabelledAnnotation> getLabelledAnnotations() {
		return labelledAnnotations;
	}
	
	public List<LabelledAnnotation> getAllMatchingAnnotations() {
		return allMatchingAnnotations;
	}
	
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if(size() > 0) {
			return MoreObjects.toStringHelper(this)
					.add("begin", this.getLabelledAnnotations().get(0).getAnnotation().getBegin())
					.add("end", this.getLabelledAnnotations().get(size()-1).getAnnotation().getEnd())
//					.add("pattern", Joiner.on(" ").join(this.getLabels()))
					.toString();
		} else {
			return MoreObjects.toStringHelper(this)
					.add("size", 0)
					.toString();
		}
	}

	
	public List<String> getLabels() {
		return labels;
	}

	public int getBegin() {
		return begin;
	}
	public int getEnd() {
		return end;
	}

	public String asPatternString() {
		return Joiner.on(WHITESPACE).join(this.getLabels());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(begin, end);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RegexOccurrence) {
			RegexOccurrence o = (RegexOccurrence) obj;
			return this.begin == o.begin && this.end == o.end;
		} else
			return false;
	}

	public Rule getRule() {
		return rule;
	}

	public void setAutomatonInstanceId(int automatonInstanceId) {
		this.automatonInstanceId = automatonInstanceId;
	}

	public int getAutomatonInstanceId() {
		return automatonInstanceId;
	}
}