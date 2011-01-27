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
 * @author vroman
 * 
 */
public final class SystemMetricsImpl implements SystemMetrics {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7765634923723290400L;

	private long creationTime;

	private double systemLoadAverage;
	private long totalSystemFreeMemory;
	private long totalSystemUsedMemory;
	private long totalSystemUsedSwap;
	private long systemOpenFileDescriptors;
	private long swapIn;
	private long swapOut;
	private long ioRead;
	private long ioWrite;
	private double userPerc;
	private double sysPerc;
	private double idlePerc;
	private double waitPerc;
	private double irqPerc;
	private double user;
	private double sys;
	private double idle;
	private double wait;
	private double irq;

	public SystemMetricsImpl(double systemLoadAverage, long totalSystemFreeMemory,
			long totalSystemUsedMemory, long totalSystemUsedSwap, long systemOpenFileDescriptors,
			long swapIn, long swapOut, long ioRead, long ioWrite, double userPerc, double sysPerc,
			double idlePerc, double waitPerc, double irqPerc, double user, double sys, double idle,
			double wait, double irq) {
		this.creationTime = System.currentTimeMillis();
		this.systemLoadAverage = systemLoadAverage;
		this.totalSystemFreeMemory = totalSystemFreeMemory;
		this.totalSystemUsedMemory = totalSystemUsedMemory;
		this.totalSystemUsedSwap = totalSystemUsedSwap;
		this.systemOpenFileDescriptors = systemOpenFileDescriptors;
		this.swapIn = swapIn;
		this.swapOut = swapOut;
		this.ioRead = ioRead;
		this.ioWrite = ioWrite;
		this.userPerc = userPerc;
		this.sysPerc = sysPerc;
		this.idlePerc = idlePerc;
		this.waitPerc = waitPerc;
		this.irqPerc = irqPerc;
		this.user = user;
		this.sys = sys;
		this.idle = idle;
		this.wait = wait;
		this.irq = irq;
	}

	@Override
	public long getCreationTime() {
		return creationTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSystemLoadAverage()
	 */
	@Override
	public double getSystemLoadAverage() {
		return systemLoadAverage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getTotalSystemFreeMemory()
	 */
	@Override
	public long getTotalSystemFreeMemory() {
		return totalSystemFreeMemory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getTotalSystemUsedMemory()
	 */
	@Override
	public long getTotalSystemUsedMemory() {
		return totalSystemUsedMemory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getTotalSystemUsedSwap()
	 */
	@Override
	public long getTotalSystemUsedSwap() {
		return totalSystemUsedSwap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSystemOpenFileDescriptors()
	 */
	@Override
	public long getSystemOpenFileDescriptors() {
		return systemOpenFileDescriptors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSwapIn()
	 */
	@Override
	public long getSwapIn() {
		return swapIn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSwapOut()
	 */
	@Override
	public long getSwapOut() {
		return swapOut;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIORead()
	 */
	@Override
	public long getIORead() {
		return ioRead;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIOWrite()
	 */
	@Override
	public long getIOWrite() {
		return ioWrite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getUserPerc()
	 */
	@Override
	public double getUserPerc() {
		return userPerc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSysPerc()
	 */
	@Override
	public double getSysPerc() {
		return sysPerc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIdlePerc()
	 */
	@Override
	public double getIdlePerc() {
		return idlePerc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getWaitPerc()
	 */
	@Override
	public double getWaitPerc() {
		return waitPerc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIrqPerc()
	 */
	@Override
	public double getIrqPerc() {
		return irqPerc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getUser()
	 */
	@Override
	public double getUser() {
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getSys()
	 */
	@Override
	public double getSys() {
		return sys;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIdle()
	 */
	@Override
	public double getIdle() {
		return idle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getWait()
	 */
	@Override
	public double getWait() {
		return wait;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sim.data.SystemMetrics#getIrq()
	 */
	@Override
	public double getIrq() {
		return irq;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SystemMetricsImpl [creationTime=");
		builder.append(creationTime);
		builder.append(", systemLoadAverage=");
		builder.append(systemLoadAverage);
		builder.append(", totalSystemFreeMemory=");
		builder.append(totalSystemFreeMemory);
		builder.append(", totalSystemUsedMemory=");
		builder.append(totalSystemUsedMemory);
		builder.append(", totalSystemUsedSwap=");
		builder.append(totalSystemUsedSwap);
		builder.append(", systemOpenFileDescriptors=");
		builder.append(systemOpenFileDescriptors);
		builder.append(", swapIn=");
		builder.append(swapIn);
		builder.append(", swapOut=");
		builder.append(swapOut);
		builder.append(", ioRead=");
		builder.append(ioRead);
		builder.append(", ioWrite=");
		builder.append(ioWrite);
		builder.append(", userPerc=");
		builder.append(userPerc);
		builder.append(", sysPerc=");
		builder.append(sysPerc);
		builder.append(", idlePerc=");
		builder.append(idlePerc);
		builder.append(", waitPerc=");
		builder.append(waitPerc);
		builder.append(", irqPerc=");
		builder.append(irqPerc);
		builder.append(", user=");
		builder.append(user);
		builder.append(", sys=");
		builder.append(sys);
		builder.append(", idle=");
		builder.append(idle);
		builder.append(", wait=");
		builder.append(wait);
		builder.append(", irq=");
		builder.append(irq);
		builder.append("]");
		return builder.toString();
	}

}
