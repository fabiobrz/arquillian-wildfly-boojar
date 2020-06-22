/*
 * Copyright 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.boojar.arquillian.container.managed;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.as.arquillian.container.CommonContainerExtension;

/**
 * The extensions used by the managed container.
 */
public class ManagedContainerExtension extends CommonContainerExtension {

    @Override
    public void register(ExtensionBuilder builder) {
        super.register(builder);
        builder.service(DeployableContainer.class, ManagedDeployableContainer.class);
    }
}
