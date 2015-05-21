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
 *
 */

package org.onosproject.cord.gui.model;

import com.google.common.collect.ImmutableSet;

import java.util.Set;


/**
 * Base implementation of BundleDescriptor.
 */
public class DefaultBundleDescriptor implements BundleDescriptor {

    private final String id;
    private final String displayName;
    private final Set<XosFunctionDescriptor> functions;

    /**
     * Constructs a bundle descriptor.
     *
     * @param id bundle identifier
     * @param displayName bundle display name
     * @param functions functions that make up this bundle
     */
    DefaultBundleDescriptor(String id, String displayName,
                            XosFunctionDescriptor... functions) {
        this.id = id;
        this.displayName = displayName;
        this.functions = ImmutableSet.copyOf(functions);
    }


    public String id() {
        return id;
    }

    public String displayName() {
        return displayName;
    }

    public Set<XosFunctionDescriptor> functions() {
        return functions;
    }
}