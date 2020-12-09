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
package de.uni_mannheim.informatik.dws.winter.matching.blockers;

import de.uni_mannheim.informatik.dws.winter.matching.blockers.generators.BlockingKeyGenerator;
import de.uni_mannheim.informatik.dws.winter.model.Matchable;

/**
 * Blocking-key based blocker for identity resolution
 * 
 * @author Oliver Lehmberg (oli@dwslab.de)
 *
 */
public class StandardRecordBlockerWithBlockFiltering<RecordType extends Matchable, SchemaElementType extends Matchable>
		extends StandardBlockerWithBlockFiltering<RecordType, SchemaElementType, RecordType, SchemaElementType> {

	public StandardRecordBlockerWithBlockFiltering(
			BlockingKeyGenerator<RecordType, SchemaElementType, RecordType> blockingFunction, double ratio) {
		super(blockingFunction, ratio);
	}

	public StandardRecordBlockerWithBlockFiltering(
			BlockingKeyGenerator<RecordType, SchemaElementType, RecordType> blockingFunction,
			BlockingKeyGenerator<RecordType, SchemaElementType, RecordType> secondBlockingFunction) {
		super(blockingFunction, secondBlockingFunction);
	}

}
