/**
 * boilerpipe
 *
 * Copyright (c) 2009 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.l3s.boilerpipe.document;

/**
 * Some pre-defined labels which can be used in conjunction with
 * {@link TextBlock#addLabel(String)} and {@link TextBlock#hasLabel(String)}.
 * 
 * @author Christian Kohlschütter
 */
public final class TextBlockLabel {
    public static final String TITLE = "de.l3s.boilerpipe/TITLE";
    public static final String INDICATES_END_OF_TEXT = "de.l3s.boilerpipe/INDICATES_END_OF_TEXT";
    public static final String MIGHT_BE_CONTENT = "de.l3s.boilerpipe/MIGHT_BE_CONTENT";
}
