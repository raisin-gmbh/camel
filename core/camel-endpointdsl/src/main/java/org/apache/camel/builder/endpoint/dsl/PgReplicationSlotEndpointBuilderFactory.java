/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Consumer endpoint to receive from PostgreSQL Replication Slot.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PgReplicationSlotEndpointBuilderFactory {


    /**
     * Builder for endpoint for the PostgresSQL Replication Slot component.
     */
    public interface PgReplicationSlotEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPgReplicationSlotEndpointBuilder advanced() {
            return (AdvancedPgReplicationSlotEndpointBuilder) this;
        }
        /**
         * PostgreSQL password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PgReplicationSlotEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * PostgreSQL username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PgReplicationSlotEndpointBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PostgresSQL Replication Slot
     * component.
     */
    public interface AdvancedPgReplicationSlotEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default PgReplicationSlotEndpointBuilder basic() {
            return (PgReplicationSlotEndpointBuilder) this;
        }
        /**
         * Auto create slot if it does not exist.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder autoCreateSlot(
                Boolean autoCreateSlot) {
            setProperty("autoCreateSlot", autoCreateSlot);
            return this;
        }
        /**
         * Auto create slot if it does not exist.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder autoCreateSlot(
                String autoCreateSlot) {
            setProperty("autoCreateSlot", autoCreateSlot);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Slot options to be passed to the output plugin.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder slotOptions(
                Map<String, Object> slotOptions) {
            setProperty("slotOptions", slotOptions);
            return this;
        }
        /**
         * Slot options to be passed to the output plugin.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder slotOptions(
                String slotOptions) {
            setProperty("slotOptions", slotOptions);
            return this;
        }
        /**
         * Specifies the number of seconds between status packets sent back to
         * Postgres server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder statusInterval(
                Integer statusInterval) {
            setProperty("statusInterval", statusInterval);
            return this;
        }
        /**
         * Specifies the number of seconds between status packets sent back to
         * Postgres server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder statusInterval(
                String statusInterval) {
            setProperty("statusInterval", statusInterval);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPgReplicationSlotEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * PostgresSQL Replication Slot (camel-pg-replication-slot)
     * Consumer endpoint to receive from PostgreSQL Replication Slot.
     * 
     * Syntax: <code>pg-replication-slot:host:port/database/slot:plugin</code>
     * Category: database,sql
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-pg-replication-slot
     */
    default PgReplicationSlotEndpointBuilder pgReplicationSlot(String path) {
        class PgReplicationSlotEndpointBuilderImpl extends AbstractEndpointBuilder implements PgReplicationSlotEndpointBuilder, AdvancedPgReplicationSlotEndpointBuilder {
            public PgReplicationSlotEndpointBuilderImpl(String path) {
                super("pg-replication-slot", path);
            }
        }
        return new PgReplicationSlotEndpointBuilderImpl(path);
    }
}