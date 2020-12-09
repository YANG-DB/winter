/*
 * Copyright (c) 2017 Data and Web Science Group, University of Mannheim, Germany (http://dws.informatik.uni-mannheim.de/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package de.uni_mannheim.informatik.dws.winter.processing;

/**
 * {@link DataIterator} that produces a {@link Processable} as result
 * 
 * @author Oliver Lehmberg (oli@dwslab.de)
 *
 */
public class ProcessableCollector<RecordType> implements DataIterator<RecordType> {

	private static final long serialVersionUID = 1L;
	private Processable<RecordType> result;
	
	/**
	 * @return the result
	 */
	public Processable<RecordType> getResult() {
		return result;
	}
	
	/**
	 * @param result the result to set
	 */
	public void setResult(Processable<RecordType> result) {
		this.result = result;
	}
	
	@Override
	public void initialise() {
	}

	@Override
	public void next(RecordType record) {
		result.add(record);
	}

	@Override
	public void finalise() {
	}

}

