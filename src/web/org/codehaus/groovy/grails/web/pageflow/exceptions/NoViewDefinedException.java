/*
 * Copyright 2004-2005 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
package org.codehaus.groovy.grails.web.pageflow.exceptions;

/**
 * <p>Thrown when no view is configured for a state when one is expected.
 * 
 * @author Steven Devijver
 * @since Aug 6, 2005
 */
public class NoViewDefinedException extends GrailsPageFlowException {

	public NoViewDefinedException() {
		super();
	}

	public NoViewDefinedException(String arg0) {
		super(arg0);
	}

	public NoViewDefinedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public NoViewDefinedException(Throwable arg0) {
		super(arg0);
	}

}
