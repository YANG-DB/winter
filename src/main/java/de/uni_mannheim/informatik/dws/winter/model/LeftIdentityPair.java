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
package de.uni_mannheim.informatik.dws.winter.model;

/**
 * A {@link Pair} that is equal to another pair if the first element of both pairs is equal. 
 * 
 * @author Oliver Lehmberg (oli@dwslab.de)
 *
 */
public class LeftIdentityPair<T, U> extends Pair<T, U> {

	private static final long serialVersionUID = 1L;

	public LeftIdentityPair() {
		super();
	}
	
	public LeftIdentityPair(T first, U second) {
		super(first, second);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return getFirst().hashCode(); 
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pair))
			return false;
		Pair other = (Pair) obj;
		if (getFirst() == null) {
			if (other.getFirst() != null)
				return false;
		} else if (!getFirst().equals(other.getFirst()))
			return false;
		return true;
	}
}
