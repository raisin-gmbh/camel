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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validates the payload of a message using RelaxNG Syntax using Jing library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JingEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Jing component.
     */
    public interface JingEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedJingEndpointBuilder advanced() {
            return (AdvancedJingEndpointBuilder) this;
        }
        /**
         * Whether to validate using RelaxNG compact syntax or not. By default
         * this is false for using RelaxNG XML Syntax (rng) And true is for
         * using RelaxNG Compact Syntax (rnc).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JingEndpointBuilder compactSyntax(boolean compactSyntax) {
            setProperty("compactSyntax", compactSyntax);
            return this;
        }
        /**
         * Whether to validate using RelaxNG compact syntax or not. By default
         * this is false for using RelaxNG XML Syntax (rng) And true is for
         * using RelaxNG Compact Syntax (rnc).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JingEndpointBuilder compactSyntax(String compactSyntax) {
            setProperty("compactSyntax", compactSyntax);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Jing component.
     */
    public interface AdvancedJingEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JingEndpointBuilder basic() {
            return (JingEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJingEndpointBuilder basicPropertyBinding(
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
        default AdvancedJingEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedJingEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJingEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Jing (camel-jing)
     * Validates the payload of a message using RelaxNG Syntax using Jing
     * library.
     * 
     * Syntax: <code>jing:resourceUri</code>
     * Category: validation
     * Available as of version: 1.1
     * Maven coordinates: org.apache.camel:camel-jing
     */
    default JingEndpointBuilder jing(String path) {
        class JingEndpointBuilderImpl extends AbstractEndpointBuilder implements JingEndpointBuilder, AdvancedJingEndpointBuilder {
            public JingEndpointBuilderImpl(String path) {
                super("jing", path);
            }
        }
        return new JingEndpointBuilderImpl(path);
    }
}