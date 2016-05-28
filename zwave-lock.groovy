/**
 *  Copyright 2015 SmartThings
 *
 *	modified lines 478,499 delay from 4200 to 2200 to report valid state of lock.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
  definition (name: "Z-Wave Lock Reporting", namespace: "smartthings", author: "SmartThings") {
    capability "Actuator"
    capability "Lock"
    capability "Polling"
    capability "Refresh"
    capability "Sensor"
    capability "Lock Codes"
    capability "Battery"

    command "unlockwtimeout"

    fingerprint deviceId: "0x4003", inClusters: "0x98"
    fingerprint deviceId: "0x4004", inClusters: "0x98"
  }

  simulator {
    status "locked": "command: 9881, payload: 00 62 03 FF 00 00 FE FE"
    status "unlocked": "command: 9881, payload: 00 62 03 00 00 00 FE FE"
