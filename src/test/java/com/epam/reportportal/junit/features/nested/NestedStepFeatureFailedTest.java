/*
 * Copyright 2020 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.junit.features.nested;

import com.epam.reportportal.annotations.Step;
import org.junit.Test;

public class NestedStepFeatureFailedTest {

	public static final String NESTED_STEP_NAME_TEMPLATE = "I am nested step with parameter - '{param}'";
	public static final String PARAM = "test param";

	@Test
	public void test() {
		failedMethod(PARAM);
	}

	@Step(NESTED_STEP_NAME_TEMPLATE)
	public void failedMethod(String param) {
		throw new RuntimeException("Some random error");
	}
}
