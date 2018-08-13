/*-
 * <<
 * DBus
 * ==
 * Copyright (C) 2016 - 2018 Bridata
 * ==
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
 * >>
 */

package com.creditease.dbus.heartbeat.dao;

import com.creditease.dbus.heartbeat.vo.HeartBeatMonitorVo;

public interface IHeartBeatDao {

    int sendPacket(String key, String dsName, String schemaName, String tableName, String packet, boolean isMysql);

    int deleteOldHeartBeat(String key, boolean isMysql);

    HeartBeatMonitorVo queryLatestHeartbeat(String key, String dsName, String schemaName, boolean isMysql);
}
