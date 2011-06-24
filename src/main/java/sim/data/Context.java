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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

/**
 * A <code>Context</code> is a container of information for an execution flow
 * subgraph.
 * <p>
 * It is uniquely identify by an <code>id</code>, it has a <code>name</code> and
 * a <code>tag</code> and is linked to its parent <code>Context</code> through
 * <code>parent</code> (which can be null in case this context is the root
 * context).
 * <p>
 * Any system can be seen as a black box that takes external input, processes it
 * and produces the output. We call this process, of taking the input and
 * producing the output, an "execution flow". So an execution flow can be seen
 * as a series of operations, that can be executed either one after the other or
 * in parallel or both. These operations can be grouped based on logical
 * function they perform. Tracking these logical groups is made possible by
 * creating one <code>Context</code> for each of them. Operations from one
 * logical group will then use the <code>Context</code> of that logical group to
 * publish information.
 * <p>
 * For example, in case of an ETL (Extract, Transform, Load) type of execution
 * flow, we would like to group the operations of this execution flow into the
 * three logical functions, in our case: extract, transform, load. This can be
 * done by creating three <code>Context</code> instances for each logical
 * function. Operations executing for logical function Extract would operate on
 * the Extract <code>Context</code>, those for Transform would operate on the
 * Transform <code>Context</code> and those for Load would operate on the Load
 * <code>Context</code>.
 * 
 * @author mcq
 * 
 */
public final class Context implements Metrics {
	private static final long serialVersionUID = 1L;
	private final Map<String, Object> storage = new HashMap<String, Object>();
	private final String id;
	private final String name;
	private final String tag;
	private final String parentContextId;
	private final long creationTime;
	private long endTime;

	public static Context create(String name, String tag, String parentContextId) {
		return new Context(name, tag, parentContextId);
	}

	public Context endContext() {
		endTime = System.currentTimeMillis();
		return this;
	}

	private Context(String name, String tag, String parentContextId) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.tag = tag;
		this.parentContextId = parentContextId;
		this.creationTime = System.currentTimeMillis();
	}

	public Context put(String key, Object value) {
		storage.put(key, value);
		return this;
	}

	public Context putAll(Context values) {
		if (values != null) {
			storage.putAll(values.storage);
		}
		return this;
	}

	public Context putAll(Map<String, Object> values) {
		if (values != null) {
			storage.putAll(values);
		}
		return this;
	}

	public Context remove(String key) {
		storage.remove(key);
		return this;
	}

	public boolean containsKey(String key) {
		return storage.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return storage.containsValue(value);
	}

	public Set<Entry<String, Object>> entrySet() {
		return storage.entrySet();
	}

	public Object get(String key) {
		return storage.get(key);
	}

	public boolean isEmpty() {
		return storage.isEmpty();
	}

	public Set<String> keySet() {
		return storage.keySet();
	}

	public int size() {
		return storage.size();
	}

	public Collection<Object> values() {
		return storage.values();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Context [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", tag=");
		builder.append(tag);
		builder.append(", parentContextId=");
		builder.append(parentContextId);
		builder.append(", creationTime=");
		builder.append(creationTime);
		builder.append(", endTime=");
		builder.append(endTime);
		builder.append(", storage=");
		builder.append(storage);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Context))
			return false;
		Context other = (Context) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTag() {
		return tag;
	}

	@Override
	public long getCreationTime() {
		return creationTime;
	}

	public long getEndTime() {
		return endTime;
	}

	@Override
	public void accept(MetricsVisitor visitor) {
		visitor.visit(this);
	}

	public String getParentContextId() {
		return parentContextId;
	}
}
