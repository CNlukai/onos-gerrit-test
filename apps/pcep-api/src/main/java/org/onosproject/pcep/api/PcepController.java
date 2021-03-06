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
package org.onosproject.pcep.api;

import org.onosproject.net.DeviceId;

/**
 * Abstraction of an PCEP controller. Serves as a one stop shop for obtaining
 * PCEP devices and (un)register listeners on PCEP events
 */
public interface PcepController {

    /**
     * Returns all switches known to this PCEP controller.
     *
     * @return Iterable of did elements
     */
    public Iterable<PcepSwitch> getSwitches();

    /**
     * Return a switch with a specified did.
     *
     * @param did of a device
     * @return a pcep device
     */
    public PcepSwitch getSwitch(PcepDpid did);

    /**
     * Register a listener for meta events that occur to PCEP devices.
     *
     * @param listener the listener to notify
     */
    public void addListener(PcepSwitchListener listener);

    /**
     * Unregister a listener.
     *
     * @param listener the listener to unregister
     */
    public void removeListener(PcepSwitchListener listener);

    /**
     * Register a listener for meta events that occur to PCEP links.
     *
     * @param listener the listener to notify
     */
    public void addLinkListener(PcepLinkListener listener);

    /**
     * Unregister a link listener.
     *
     * @param listener the listener to unregister
     */
    public void removeLinkListener(PcepLinkListener listener);

    /**
     * Register a listener for meta events that occur to PCEP tunnel.
     *
     * @param listener the listener to notify
     */
    public void addTunnelListener(PcepTunnelListener listener);

    /**
     * Unregister a tunnel listener.
     *
     * @param listener the listener to unregister
     */
    public void removeTunnelListener(PcepTunnelListener listener);

    /**
     * Setup a tunnel through pcep controller.
     *
     * @param srcDid src deviceId of tunnel
     * @param dstDid dst deviceId of tunnel
     * @param srcPort src port
     * @param dstPort dst port
     * @param bandwidth andwidth of tunnel
     * @param name tunnel name
     * @return pcep tunnel
     */
    public PcepTunnel applyTunnel(DeviceId srcDid, DeviceId dstDid,
                                  long srcPort, long dstPort, long bandwidth,
                                  String name);

    /**
     * Delete tunnel by id.
     *
     * @param id pcep tunnel id.
     * @return true or false
     */
    public Boolean deleteTunnel(String id);

    /**
     * Update tunnel bandwidth by tunnel id.
     *
     * @param id tunnel id
     * @param bandwidth bandwidth of a tunnel
     * @return true or false
     */
    public Boolean updateTunnelBandwidth(String id, long bandwidth);

}
