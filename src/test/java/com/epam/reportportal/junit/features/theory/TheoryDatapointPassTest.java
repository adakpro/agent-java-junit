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

package com.epam.reportportal.junit.features.theory;

import org.junit.Assume;
import org.junit.AssumptionViolatedException;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.equalTo;

/**
 * A theories test which uses {@link DataPoints}. The test should pass, since all of thrown exceptions are
 * {@link AssumptionViolatedException} and there is one passed test.
 */
@RunWith(Theories.class)
public class TheoryDatapointPassTest {

	@DataPoints
	public static Boolean[] data() {
		return new Boolean[] { true, false, null };
	}

	@Theory
	public void theories(Boolean data) {
		Assume.assumeThat(data, equalTo(Boolean.FALSE));
	}
}
