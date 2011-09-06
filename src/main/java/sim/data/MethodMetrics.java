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
 * Holds information about a method execution.
 * <p>
 * List of collected metrics and their explanation:
 * <ul>
 * <li>wall clock time - elapsed time between method entry and method exit (ms)</li>
 * <li>thread user cpu time - user CPU time spent by current thread executing
 * this method (ms)</li>
 * <li>thread system cpu time - system CPU time spent by current thread
 * executing this method (ms)</li>
 * <li>thread total cpu time - total CPU time spent by current thread executing
 * this method (user time + system time) (ms)</li>
 * <li>process total cpu time - total CPU time spent by current process (all
 * threads from the application) executing this method (ms)</li>
 * <li>thread count - total number of threads that were started during this
 * method execution (count)</li>
 * <li>thread block count - the total number of times that the current thread
 * executing this method entered the BLOCKED state (count)</li>
 * <li>thread block time - the total accumulated time the current thread
 * executing this method has been in the BLOCKED (ms)</li>
 * <li>thread wait count - the number of times that the current thread executing
 * this method has been in the WAITING or TIMED_WAITING state (count)</li>
 * <li>thread wait time - the total accumulated time the current thread
 * executing this method has been in the WAITING or TIMED_WAITING state (ms)</li>
 * <li>gcc count - total number of collections that have occurred while
 * executing this method</li>
 * <li>gcc time - approximate accumulated collection elapsed time in
 * milliseconds while executing this method</li>
 * <li>allocated memory before - the amount of allocated (commited) memory
 * before method execution (bytes)</li>
 * <li>allocated memory after - the amount of allocated (commited) memory after
 * method execution (bytes)</li>
 * <li>used memory before - the amount of allocated and used memory before
 * method execution (bytes)</li>
 * <li>used memory after - the amount of allocated and used memory after method
 * execution (bytes)</li>
 * <li>free memory before - the amount of allocated and free memory before
 * method execution (bytes)</li>
 * <li>free memory after - the amount of allocated and free memory after method
 * execution (bytes)</li>
 * <li>unallocated memory before - the amount of unallocated (and free to
 * allocate) memory before method execution (bytes)</li>
 * <li>unallocated memory after - the amount of unallocated (and free to
 * allocate) memory after method execution (bytes)</li>
 * 
 * </ul>
 * 
 * @author mcq
 * 
 */
public interface MethodMetrics extends Metrics {

	/**
	 * @return the method
	 */
	public Method getMethod();

	/**
	 * @return this system id
	 */
	public SystemId getSystemId();

	/**
	 * Sets the system id.
	 * <p>
	 * Setter needed because we can not set the system id when the method
	 * metrics is created. The agent will set this value.
	 * 
	 * @param systemId the system id
	 */
	public void setSystemId(SystemId systemId);

	/**
	 * @return id of the Context which contains method specific information
	 */
	public String getContextId();

	/**
	 * @return if the method ended with an exception this returns the string
	 *         representation of the exception
	 */
	public String getException();

	/**
	 * @return true if the method ended with an exception
	 */
	public boolean endedWithError();

	/**
	 * @return time in milliseconds when the method was started to be executed
	 *         (as returned by System.currentTimeMillis)
	 */
	public long getBeginExecutionTime();

	/**
	 * @return time in milliseconds when the method ended the execution (as
	 *         returned by System.currentTimeMillis)
	 */
	public long getEndExecutionTime();

	/**
	 * @return elapsed time between method entry and method exit (ms)
	 */
	public long getWallClockTime();

	/**
	 * @return user CPU time spent by current thread executing this method (ms)
	 */
	public long getThreadUserCpuTime();

	/**
	 * @return system CPU time spent by current thread executing this method
	 *         (ms)
	 */
	public long getThreadSystemCpuTime();

	/**
	 * @return total CPU time spent by current thread executing this method
	 *         (user time + system time) (ms)
	 */
	public long getThreadTotalCpuTime();

	/**
	 * @return total number of threads that were started during this method
	 *         execution (count)
	 */
	public long getThreadCount();

	/**
	 * @return the total number of times that the current thread executing this
	 *         method entered the BLOCKED state (count)
	 */
	public long getThreadBlockCount();

	/**
	 * @return the total accumulated time the current thread executing this
	 *         method has been in the BLOCKED (ms)
	 */
	public long getThreadBlockTime();

	/**
	 * @return the number of times that the current thread executing this method
	 *         has been in the WAITING or TIMED_WAITING state (count)
	 */
	public long getThreadWaitCount();

	/**
	 * @return the total accumulated time the current thread executing this
	 *         method has been in the WAITING or TIMED_WAITING state (ms)
	 */
	public long getThreadWaitTime();

	/**
	 * @return total number of collections that have occurred while executing
	 *         this method
	 */
	public long getThreadGccCount();

	/**
	 * @return approximate accumulated collection elapsed time in milliseconds
	 *         while executing this method
	 */
	public long getThreadGccTime();

	/**
	 * @return total CPU time spent by current process (all threads from the
	 *         application) executing this method (ms)
	 */
	public long getProcessTotalCpuTime();


	/**
	 * @return the amount of allocated (commited) memory before method execution (bytes)
	 */
	public long getAllocatedMemoryBefore();

	/**
	 * @return the amount of allocated (commited) memory after method execution (bytes)
	 */
	public long getAllocatedMemoryAfter();

	/**
	 * @return the amount of allocated and used memory before method execution
	 *         (bytes)
	 */
	public long getUsedMemoryBefore();

	/**
	 * @return the amount of allocated and used memory after method execution
	 *         (bytes)
	 */
	public long getUsedMemoryAfter();

	/**
	 * @return the amount of allocated and free memory before method execution
	 *         (bytes)
	 */
	public long getFreeMemoryBefore();

	/**
	 * @return the amount of allocated and free memory after method execution
	 *         (bytes)
	 */
	public long getFreeMemoryAfter();

	/**
	 * @return the amount of unallocated (and free to allocate) memory before
	 *         method execution (bytes)
	 */
	public long getUnallocatedMemoryBefore();

	/**
	 * @return the amount of unallocated (and free to allocate) memory after
	 *         method execution (bytes)
	 */
	public long getUnallocatedMemoryAfter();

}
