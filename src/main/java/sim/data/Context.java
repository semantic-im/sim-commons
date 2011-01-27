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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author mcq
 * 
 */
public final class Context implements Serializable {
	private static final long serialVersionUID = 1L;
	private final Map<String, Object> storage = new HashMap<String, Object>();

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
		return storage.toString();
	}

	@Override
	public boolean equals(Object arg0) {
		return storage.equals(arg0);
	}

	@Override
	public int hashCode() {
		return storage.hashCode();
	}
}
