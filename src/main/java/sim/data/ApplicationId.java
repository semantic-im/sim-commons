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
 * Identifies the origin application of the metric
 * 
 * @author valer.roman@softgress.com
 *
 */
public class ApplicationId implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/* application id */
	private final String id;

	/*application name*/
	private final String name;

	private final long totalMemory;
	private final long cpuCount;

	public ApplicationId(String id, String name) {
		this.id = id;
		this.name = name;
		totalMemory = Runtime.getRuntime().maxMemory();
		cpuCount = Runtime.getRuntime().availableProcessors();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ApplicationId))
			return false;
		ApplicationId other = (ApplicationId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicationId [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", totalMemory=");
		builder.append(totalMemory);
		builder.append(", cpuCount=");
		builder.append(cpuCount);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	public long getTotalMemory() {
		return totalMemory;
	}

	public long getCpuCount() {
		return cpuCount;
	}

}
