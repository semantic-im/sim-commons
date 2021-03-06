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
 * Implementation for {@link MethodMetrics}.
 * 
 * @author mcq
 * 
 */
public final class MethodMetricsImpl implements MethodMetrics {
	private static final long serialVersionUID = 1L;

	private long creationTime;
	private SystemId systemId;
	private Method method;

	private String contextId;
	private String exception;
	private boolean endedWithError = false;
	private long beginExecutionTime;
	private long endExecutionTime;
	private long wallClockTime;
	private long threadUserCpuTime;
	private long threadSystemCpuTime;
	private long threadTotalCpuTime;
	private long threadCount;
	private long threadBlockCount;
	private long threadBlockTime;
	private long threadWaitCount;
	private long threadWaitTime;
	private long threadGccCount;
	private long threadGccTime;
	private long processTotalCpuTime;

	private long allocatedMemoryBefore;
	private long allocatedMemoryAfter;
	private long usedMemoryBefore;
	private long usedMemoryAfter;
	private long freeMemoryBefore;
	private long freeMemoryAfter;
	private long unallocatedMemoryBefore;
	private long unallocatedMemoryAfter;

	public MethodMetricsImpl(Method method) {
		this.creationTime = System.currentTimeMillis();
		this.method = method;
	}

	@Override
	public void accept(MetricsVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public SystemId getSystemId() {
		return systemId;
	}

	@Override
	public void setSystemId(SystemId systemId) {
		this.systemId = systemId;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.Metrics#getCreationTime()
	 */
	@Override
	public long getCreationTime() {
		return creationTime;
	}

	@Override
	public String getContextId() {
		return contextId;
	}

	@Override
	public String getException() {
		return exception;
	}

	@Override
	public boolean endedWithError() {
		return endedWithError;
	}

	@Override
	public long getBeginExecutionTime() {
		return beginExecutionTime;
	}

	@Override
	public long getEndExecutionTime() {
		return endExecutionTime;
	}

	@Override
	public long getWallClockTime() {
		return wallClockTime;
	}

	@Override
	public long getThreadUserCpuTime() {
		return threadUserCpuTime;
	}

	@Override
	public long getThreadSystemCpuTime() {
		return threadSystemCpuTime;
	}

	@Override
	public long getThreadTotalCpuTime() {
		return threadTotalCpuTime;
	}

	@Override
	public long getThreadCount() {
		return threadCount;
	}

	@Override
	public long getThreadBlockCount() {
		return threadBlockCount;
	}

	@Override
	public long getThreadBlockTime() {
		return threadBlockTime;
	}

	@Override
	public long getThreadWaitCount() {
		return threadWaitCount;
	}

	@Override
	public long getThreadWaitTime() {
		return threadWaitTime;
	}

	@Override
	public long getThreadGccCount() {
		return threadGccCount;
	}

	@Override
	public long getThreadGccTime() {
		return threadGccTime;
	}

	@Override
	public long getProcessTotalCpuTime() {
		return processTotalCpuTime;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public void setEndedWithError(boolean endedWithError) {
		this.endedWithError = endedWithError;
	}

	public void setBeginExecutionTime(long beginExecutionTime) {
		this.beginExecutionTime = beginExecutionTime;
	}

	public void setEndExecutionTime(long endExecutionTime) {
		this.endExecutionTime = endExecutionTime;
	}

	public void setWallClockTime(long wallClockTime) {
		this.wallClockTime = wallClockTime;
	}

	public void setThreadUserCpuTime(long threadUserCpuTime) {
		this.threadUserCpuTime = threadUserCpuTime;
	}

	public void setThreadSystemCpuTime(long threadSystemCpuTime) {
		this.threadSystemCpuTime = threadSystemCpuTime;
	}

	public void setThreadTotalCpuTime(long threadTotalCpuTime) {
		this.threadTotalCpuTime = threadTotalCpuTime;
	}

	public void setThreadCount(long threadCount) {
		this.threadCount = threadCount;
	}

	public void setThreadBlockCount(long threadBlockCount) {
		this.threadBlockCount = threadBlockCount;
	}

	public void setThreadBlockTime(long threadBlockTime) {
		this.threadBlockTime = threadBlockTime;
	}

	public void setThreadWaitCount(long threadWaitCount) {
		this.threadWaitCount = threadWaitCount;
	}

	public void setThreadWaitTime(long threadWaitTime) {
		this.threadWaitTime = threadWaitTime;
	}

	public void setThreadGccCount(long threadGccCount) {
		this.threadGccCount = threadGccCount;
	}

	public void setThreadGccTime(long threadGccTime) {
		this.threadGccTime = threadGccTime;
	}

	public void setProcessTotalCpuTime(long processTotalCpuTime) {
		this.processTotalCpuTime = processTotalCpuTime;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MethodMetricsImpl [method=");
		builder.append(method.getSignature());
		builder.append(", wallClockTime=");
		builder.append(wallClockTime);
		builder.append(", processTotalCpuTime=");
		builder.append(processTotalCpuTime);
		builder.append(", threadUserCpuTime=");
		builder.append(threadUserCpuTime);
		builder.append(", threadSystemCpuTime=");
		builder.append(threadSystemCpuTime);
		builder.append(", threadTotalCpuTime=");
		builder.append(threadTotalCpuTime);
		builder.append(", threadCount=");
		builder.append(threadCount);
		builder.append(", threadBlockCount=");
		builder.append(threadBlockCount);
		builder.append(", threadBlockTime=");
		builder.append(threadBlockTime);
		builder.append(", threadWaitCount=");
		builder.append(threadWaitCount);
		builder.append(", threadWaitTime=");
		builder.append(threadWaitTime);
		builder.append(", threadGccCount=");
		builder.append(threadGccCount);
		builder.append(", threadGccTime=");
		builder.append(threadGccTime);
		builder.append(", allocatedMemoryBefore=");
		builder.append(allocatedMemoryBefore);
		builder.append(", allocatedMemoryAfter=");
		builder.append(allocatedMemoryAfter);
		builder.append(", usedMemoryBefore=");
		builder.append(usedMemoryBefore);
		builder.append(", usedMemoryAfter=");
		builder.append(usedMemoryAfter);
		builder.append(", freeMemoryBefore=");
		builder.append(freeMemoryBefore);
		builder.append(", freeMemoryAfter=");
		builder.append(freeMemoryAfter);
		builder.append(", unallocatedMemoryBefore=");
		builder.append(unallocatedMemoryBefore);
		builder.append(", unallocatedMemoryAfter=");
		builder.append(unallocatedMemoryAfter);
		builder.append(", endedWithError=");
		builder.append(endedWithError);
		builder.append(", exception=");
		builder.append(exception);
		builder.append(", contextId=");
		builder.append(contextId);
		builder.append(", applicationId=");
		builder.append(method.getApplicationId().getId());
		builder.append(", systemId=");
		builder.append(systemId == null ? "null" : systemId.getId());
		builder.append(", creationTime=");
		builder.append(creationTime);
		builder.append(", beginExecutionTime=");
		builder.append(beginExecutionTime);
		builder.append(", endExecutionTime=");
		builder.append(endExecutionTime);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public Method getMethod() {
		return this.method;
	}

	@Override
	public long getAllocatedMemoryBefore() {
		return allocatedMemoryBefore;
	}

	public void setAllocatedMemoryBefore(long allocatedMemoryBefore) {
		this.allocatedMemoryBefore = allocatedMemoryBefore;
	}

	@Override
	public long getAllocatedMemoryAfter() {
		return allocatedMemoryAfter;
	}

	public void setAllocatedMemoryAfter(long allocatedMemoryAfter) {
		this.allocatedMemoryAfter = allocatedMemoryAfter;
	}

	@Override
	public long getUsedMemoryBefore() {
		return usedMemoryBefore;
	}

	public void setUsedMemoryBefore(long usedMemoryBefore) {
		this.usedMemoryBefore = usedMemoryBefore;
	}

	@Override
	public long getUsedMemoryAfter() {
		return usedMemoryAfter;
	}

	public void setUsedMemoryAfter(long usedMemoryAfter) {
		this.usedMemoryAfter = usedMemoryAfter;
	}

	@Override
	public long getFreeMemoryBefore() {
		return freeMemoryBefore;
	}

	public void setFreeMemoryBefore(long freeMemoryBefore) {
		this.freeMemoryBefore = freeMemoryBefore;
	}

	@Override
	public long getFreeMemoryAfter() {
		return freeMemoryAfter;
	}

	public void setFreeMemoryAfter(long freeMemoryAfter) {
		this.freeMemoryAfter = freeMemoryAfter;
	}

	@Override
	public long getUnallocatedMemoryBefore() {
		return unallocatedMemoryBefore;
	}

	public void setUnallocatedMemoryBefore(long unallocatedMemoryBefore) {
		this.unallocatedMemoryBefore = unallocatedMemoryBefore;
	}

	@Override
	public long getUnallocatedMemoryAfter() {
		return unallocatedMemoryAfter;
	}

	public void setUnallocatedMemoryAfter(long unallocatedMemoryAfter) {
		this.unallocatedMemoryAfter = unallocatedMemoryAfter;
	}

}
