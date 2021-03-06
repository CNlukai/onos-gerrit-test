/*
 * Copyright 2014 Open Networking Laboratory
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
package org.onosproject.net.packet;



/**
 * Abstraction of an inbound packet processor.
 */
public interface PacketProcessor {

    static final int ADVISOR_MAX = Integer.MAX_VALUE / 3;
    static final int DIRECTOR_MAX = (Integer.MAX_VALUE / 3) * 2;
    static final int OBSERVER_MAX = Integer.MAX_VALUE;

    /**
     * Processes the inbound packet as specified in the given context.
     *
     * @param context packet processing context
     */
    void process(PacketContext context);

}
