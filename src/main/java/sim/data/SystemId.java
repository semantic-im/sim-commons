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
 * Identifies the system of the read metric
 * 
 * @author valer.roman@softgress.com
 *
 */
public class SystemId implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/* id of the system */
	private final String id;

	/*name of the system*/
	private final String name;

	private final long totalMemory;
	private final long cpuCount;

	public SystemId(String id, String name, long totalMemory, long cpuCount) {
		this.id = id;
		this.name = name;
		this.totalMemory = totalMemory;
		this.cpuCount = cpuCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SystemId))
			return false;
		SystemId other = (SystemId) obj;
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
		builder.append("SystemId [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
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
