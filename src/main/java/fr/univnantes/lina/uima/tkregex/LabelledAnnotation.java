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
package fr.univnantes.lina.uima.tkregex;

import org.apache.uima.cas.text.AnnotationFS;

import com.google.common.base.MoreObjects;

public class LabelledAnnotation {
	private AnnotationFS annotation;
	private String label;
	private boolean ignored;
	public LabelledAnnotation(AnnotationFS annotation, String label, boolean ignored) {
		super();
		this.annotation = annotation;
		this.label = label;
		this.ignored = ignored;
	}
	public AnnotationFS getAnnotation() {
		return annotation;
	}
	public String getLabel() {
		return label;
	}
	public boolean isIgnored() {
		return ignored;
	}
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("label", label)
				.add("ignored", ignored)
				.add("begin", annotation.getBegin())
				.add("end", annotation.getEnd())
				.add("text", annotation.getCoveredText())
				.toString();
	}
}