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

package com.epam.reportportal.junit.features.parameters;

import com.epam.reportportal.annotations.ParameterKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StandardParametersNoInterfaceTest {

	@Parameters
	public static Object[] params() {
		return new Object[] { "one", "two, three" };
	}

	private final String parameter;

	public StandardParametersNoInterfaceTest(@ParameterKey("param") String param) {
		parameter = param;
	}

	@Test
	public void testParameters() {
		System.out.println("Parameter test: " + parameter);
	}
}
