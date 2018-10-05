/*
 * Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.client.impl.clientside;

import com.hazelcast.client.connection.AddressProvider;
import com.hazelcast.client.connection.AddressTranslator;
import com.hazelcast.client.connection.ClientConnectionManager;
import com.hazelcast.client.connection.nio.ClientConnectionManagerImpl;

import java.util.Collection;

public class DefaultClientConnectionManagerFactory implements ClientConnectionManagerFactory {

    public DefaultClientConnectionManagerFactory() {
    }

    @Override
    public ClientConnectionManager createConnectionManager(HazelcastClientInstanceImpl client,
                                                           AddressTranslator addressTranslator,
                                                           Collection<AddressProvider> addressProviders) {


        return new ClientConnectionManagerImpl(client, addressTranslator, addressProviders);
    }
}