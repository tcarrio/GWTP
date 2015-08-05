/*
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

package com.gwtplatform.dispatch.rpc.shared;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * A marker interface for {@link Action} results.<p>
 *
 * Result is used instead of Serializable to prevent
 * the RPC mechanism from generating a serializer for all classes
 * that implement Serializable.
 *
 * @see
 * {@link SimpleResult}<br>
 * {@link MultipleResult}<br>
 * {@link NoResult}<br>
 *
 */
public interface Result extends IsSerializable, Serializable {
}