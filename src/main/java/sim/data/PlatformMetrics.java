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
 * <li>total gcc count - total number of collections since jvm start (count)</li>
 * <li>total gcc time - total accumulated collection elapsed time since jvm
 * start (ms)</li>
 * <li>gcc count - number of collections since last measurement (count)</li>
 * <li>gcc time - accumulated collection elapsed time since last measurement
 * (ms)</li>
 * <li>total cpu time - total CPU time used by current instrumented application
 * since jvm start (ms)</li>
 * <li>cpu time - CPU time used by current instrumented application since last
 * measurement (ms)</li>
 * <li>uptime - total time since jvm start (ms)</li>
 * <li>average cpu usage - average cpu usage since jvm start (%)</li>
 * <li>cpu usage - average cpu usage since last measurement (%)</li>
 * <li>allocated memory - the amount of current allocated (commited) memory in
 * bytes (bytes)</li>
 * <li>used memory - the amount of current allocated and used memory in bytes
 * (bytes)</li>
 * <li>free memory - the amount of current allocated and free memory in bytes
 * (bytes)</li>
 * <li>unallocated memory - the amount of current unallocated (and free to
 * allocate) memory in bytes (bytes)</li>
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
	 * @return total number of collections since jvm start (count)
	 */
	public long getTotalGccCount();

	/**
	 * @return total accumulated collection elapsed time since jvm start (ms)
	 */
	public long getTotalGccTime();

	/**
	 * @return number of collections since last measurement (count)
	 */
	public long getGccCount();

	/**
	 * @return accumulated collection elapsed time since last measurement (ms)
	 */
	public long getGccTime();

	/**
	 * @return total CPU time used by current instrumented application since jvm
	 *         start (ms)
	 */
	public long getTotalCpuTime();

	/**
	 * @return CPU time used by current instrumented application since last
	 *         measurement (ms)
	 */
	public long getCpuTime();

	/**
	 * @return the amount of current allocated (commited) memory in bytes
	 *         (bytes)
	 */
	public long getAllocatedMemory();

	/**
	 * @return the amount of current allocated and used memory in bytes (bytes)
	 */
	public long getUsedMemory();

	/**
	 * @return the amount of current allocated and free memory in bytes (bytes)
	 */
	public long getFreeMemory();

	/**
	 * @return the amount of current unallocated (and free to allocate) memory
	 *         in bytes (bytes)
	 */
	public long getUnallocatedMemory();

	/**
	 * @return total time since platform start (ms)
	 */
	public long getUptime();

	/**
	 * @return average cpu usage since jvm start (%)
	 */
	public double getAvgCpuUsage();

	/**
	 * @return average cpu usage since last measurement (%)
	 */
	public double getCpuUsage();
}
