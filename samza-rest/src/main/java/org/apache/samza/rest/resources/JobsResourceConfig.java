/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.samza.rest.resources;

import org.apache.samza.config.Config;


/**
 * Configurations for the {@link JobsResource} endpoint.
 */
public class JobsResourceConfig extends BaseResourceConfig {

  /**
   * Specifies the canonical name of the {@link org.apache.samza.rest.proxy.job.JobProxyFactory} class to produce
   * {@link org.apache.samza.rest.proxy.job.JobProxy} instances.
   *
   * To use your own proxy, implement the factory and specify the class for this config.
   */
  public static final String CONFIG_JOB_PROXY_FACTORY = "job.proxy.factory.class";

  public JobsResourceConfig(Config config) {
    super(config);
  }

  /**
   * @see JobsResourceConfig#CONFIG_JOB_PROXY_FACTORY
   * @return the canonical name of the {@link org.apache.samza.rest.proxy.job.JobProxyFactory} class to produce
   * {@link org.apache.samza.rest.proxy.job.JobProxy} instances.
   */
  public String getJobProxyFactory() {
    return get(CONFIG_JOB_PROXY_FACTORY);
  }
}
