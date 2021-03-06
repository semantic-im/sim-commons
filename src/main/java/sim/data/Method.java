/*
 * Copyright 2010 Softgress - http://www.softgress.com/
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

package sim.data;

import java.io.Serializable;

/**
 * Holds information about a method.
 * <p>
 * A method can have method executions
 * 
 * @author ioantoma
 * 
 */
public interface Method extends Serializable {

	/**
	 * @return the application id
	 */
	public ApplicationId getApplicationId();

	/**
	 * @return method name where the metrics are collected
	 */
	public String getMethodName();

	/**
	 * @return full class name where the metrics are collected
	 */
	public String getClassName();

	/**
	 * @return full class name dot method name
	 */
	public String getSignature();

}
