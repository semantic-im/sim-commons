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
 * Implementation for {@link PlatformMetrics}.
 * 
 * @author mcq
 * 
 */
public class PlatformMetricsImpl implements PlatformMetrics {
	private static final long serialVersionUID = 1L;

	private final long creationTime;
	private final ApplicationId applicationId;
	private SystemId systemId;

	private long totalGccCount;
	private long totalGccTime;
	private long totalCpuTime;
	private long gccCount;
	private long gccTime;
	private long cpuTime;
	private long allocatedMemory;
	private long usedMemory;
	private long freeMemory;
	private long unallocatedMemory;
	private long uptime;
	private double avgCpuUsage;
	private double cpuUsage;

	public PlatformMetricsImpl(ApplicationId applicationId) {
		this.creationTime = System.currentTimeMillis();
		this.applicationId = applicationId;
	}

	/* (non-Javadoc)
	 * @see sim.data.Metrics#accept(sim.data.MetricsVisitor)
	 */
	@Override
	public void accept(MetricsVisitor visitor) {
		visitor.visit(this);
	}

	/* (non-Javadoc)
	 * @see sim.data.Metrics#getCreationTime()
	 */
	@Override
	public long getCreationTime() {
		return creationTime;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getApplicationId()
	 */
	@Override
	public ApplicationId getApplicationId() {
		return applicationId;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getSystemId()
	 */
	@Override
	public SystemId getSystemId() {
		return systemId;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#setSystemId(sim.data.SystemId)
	 */
	@Override
	public void setSystemId(SystemId systemId) {
		this.systemId = systemId;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getGccCount()
	 */
	@Override
	public long getGccCount() {
		return gccCount;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getGccTime()
	 */
	@Override
	public long getGccTime() {
		return gccTime;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getCpuTime()
	 */
	@Override
	public long getCpuTime() {
		return cpuTime;
	}

	/* (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getUsedMemory()
	 */
	@Override
	public long getUsedMemory() {
		return usedMemory;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getFreeMemory()
	 */
	@Override
	public long getFreeMemory() {
		return freeMemory;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getUptime()
	 */
	@Override
	public long getUptime() {
		return uptime;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getAvgCpuUsage()
	 */
	@Override
	public double getAvgCpuUsage() {
		return avgCpuUsage;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getCpuUsage()
	 */
	@Override
	public double getCpuUsage() {
		return cpuUsage;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getTotalGccCount()
	 */
	@Override
	public long getTotalGccCount() {
		return totalGccCount;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getTotalGccTime()
	 */
	@Override
	public long getTotalGccTime() {
		return totalGccTime;
	}

	/*
	 * (non-Javadoc)
	 * @see sim.data.PlatformMetrics#getTotalCpuTime()
	 */
	@Override
	public long getTotalCpuTime() {
		return totalCpuTime;
	}

	public void setTotalGccCount(long totalGccCount) {
		this.totalGccCount = totalGccCount;
	}

	public void setTotalGccTime(long totalGccTime) {
		this.totalGccTime = totalGccTime;
	}

	public void setTotalCpuTime(long totalCpuTime) {
		this.totalCpuTime = totalCpuTime;
	}

	public void setGccCount(long gccCount) {
		this.gccCount = gccCount;
	}

	public void setGccTime(long gccTime) {
		this.gccTime = gccTime;
	}

	public void setCpuTime(long cpuTime) {
		this.cpuTime = cpuTime;
	}

	public void setUsedMemory(long usedMemory) {
		this.usedMemory = usedMemory;
	}

	public void setFreeMemory(long freeMemory) {
		this.freeMemory = freeMemory;
	}

	public void setUptime(long uptime) {
		this.uptime = uptime;
	}

	public void setAvgCpuUsage(double avgCpuUsage) {
		this.avgCpuUsage = avgCpuUsage;
	}

	public void setCpuUsage(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlatformMetricsImpl [cpuUsage=");
		builder.append(cpuUsage);
		builder.append(", allocatedMemory=");
		builder.append(allocatedMemory);
		builder.append(", usedMemory=");
		builder.append(usedMemory);
		builder.append(", freeMemory=");
		builder.append(freeMemory);
		builder.append(", unallocatedMemory=");
		builder.append(unallocatedMemory);
		builder.append(", gccTime=");
		builder.append(gccTime);
		builder.append(", gccCount=");
		builder.append(gccCount);
		builder.append(", cpuTime=");
		builder.append(cpuTime);
		builder.append(", avgCpuUsage=");
		builder.append(avgCpuUsage);
		builder.append(", totalCpuTime=");
		builder.append(totalCpuTime);
		builder.append(", totalGccTime=");
		builder.append(totalGccTime);
		builder.append(", totalGccCount=");
		builder.append(totalGccCount);
		builder.append(", uptime=");
		builder.append(uptime);
		builder.append(", ");
		builder.append(applicationId);
		builder.append(", ");
		builder.append(systemId);
		builder.append(", creationTime=");
		builder.append(creationTime);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public long getAllocatedMemory() {
		return allocatedMemory;
	}

	public void setAllocatedMemory(long allocatedMemory) {
		this.allocatedMemory = allocatedMemory;
	}

	@Override
	public long getUnallocatedMemory() {
		return unallocatedMemory;
	}

	public void setUnallocatedMemory(long unallocatedMemory) {
		this.unallocatedMemory = unallocatedMemory;
	}

}
