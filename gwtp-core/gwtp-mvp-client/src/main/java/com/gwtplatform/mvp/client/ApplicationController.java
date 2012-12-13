/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.mvp.client;

/**
 * ApplicationController will trigger the generation of your Ginjector. To activate the
 * generation of your Ginjector, remove this line from your module.gwt.xml file:
 *
 * <pre>{@code
 * <define-configuration-property name="gin.module.name" is-multi-valued="false" />
 * <set-configuration-property name="gin.module.name" value="com.arcbees.example.client.gin.ClientModule"/>
 *
 * <define-configuration-property name="gin.ginjector" is-multi-valued="false"/>
 * <set-configuration-property name="gin.ginjector" value="com.arcbees.example.client.gin.ClientGinjector"/>
 * }</pre>
 *
 * The final step is to call {@code GWTP.create(ApplicationController.class)} inside your entry point and then call
 * {@code applicationController.init()} .
 */
public interface ApplicationController {
  static final String GINJECTOR = "ClientGinjector";

  void init();
}
