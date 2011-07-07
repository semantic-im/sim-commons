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

/**
 * Holds measurements about current instrumented application.
 * <p>
 * List of collected metrics and their explanation:
 * <ul>
 * <li>gcc count - total number of collections since platform start (count)</li>
 * <li>gcc time - total accumulated collection elapsed time since platform start
 * (ms)</li>
 * <li>cpu time - total CPU time spent by current instrumented application since
 * platform start (ms)</li>
 * <li>uptime - total time since platform start (ms)</li>
 * <li>average cpu usage - average cpu usage since platform start (%)</li>
 * <li>cpu usage - cpu usage for the last 5 seconds (%)</li>
 * <li>used memory - the amount of current used memory in bytes (bytes)</li>
 * </ul>
 * 
 * @author mcq
 * 
 */
public interface PlatformMetrics extends Metrics {

	/**
	 * @return the application id
	 */
	public ApplicationId getApplicationId();

	/**
	 * @return this system id
	 */
	public SystemId getSystemId();

	/**
	 * Sets the system id.
	 * <p>
	 * Setter needed because we can not set the system id when the platform
	 * metrics is created. The agent will set this value.
	 * 
	 * @param systemId the system id
	 */
	public void setSystemId(SystemId systemId);

	/**
	 * @return total number of collections since platform start (count)
	 */
	public long getGccCount();

	/**
	 * @return total accumulated collection elapsed time since platform start
	 *         (ms)
	 */
	public long getGccTime();

	/**
	 * @return total CPU time spent by current instrumented application since
	 *         platform start (ms)
	 */
	public long getCpuTime();

	/**
	 * @return the amount of current used memory in bytes (bytes)
	 */
	public long getUsedMemory();

	/**
	 * @return total time since platform start (ms)
	 */
	public long getUptime();

	/**
	 * @return average cpu usage since platform start (%)
	 */
	public double getAvgCpuUsage();

	/**
	 * @return cpu usage for the last 5 seconds (%)
	 */
	public double getCpuUsage();
}
