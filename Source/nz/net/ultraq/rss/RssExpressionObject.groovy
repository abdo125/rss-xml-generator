/* 
 * Copyright 2015, Emanuel Rabina (http://www.ultraq.net.nz/)
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

package nz.net.ultraq.rss

/**
 * Utility class for the creation of the RSS feed.
 * 
 * @author Emanuel Rabina
 */
class RssExpressionObject {

	/**
	 * Create a CDATA section around the given content, to be used in a
	 * {@code th:utext} processor.
	 * 
	 * @param content
	 * @return CDATA section consisting of the given content.
	 */
	String generateCDATASection(String content) {

		return "<![CDATA[${content}]]>"
	}
}
