/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.store.ecmap;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.MoreObjects;

/**
 * Describes a single update event in an EventuallyConsistentMap.
 */
final class UpdateEntry<K, V> implements Comparable<UpdateEntry<K, V>> {
    private final K key;
    private final MapValue<V> value;

    /**
     * Creates a new update entry.
     *
     * @param key key of the entry
     * @param value value of the entry
     */
    public UpdateEntry(K key, MapValue<V> value) {
        this.key = checkNotNull(key);
        this.value = checkNotNull(value);
    }

    /**
     * Returns the key.
     *
     * @return the key
     */
    public K key() {
        return key;
    }

    /**
     * Returns the value of the entry.
     *
     * @return the value
     */
    public MapValue<V> value() {
        return value;
    }

    @Override
    public int compareTo(UpdateEntry<K, V> o) {
        return this.value.timestamp().compareTo(o.value.timestamp());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
                .add("key", key())
                .add("value", value)
                .toString();
    }

    @SuppressWarnings("unused")
    private UpdateEntry() {
        this.key = null;
        this.value = null;
    }
}
