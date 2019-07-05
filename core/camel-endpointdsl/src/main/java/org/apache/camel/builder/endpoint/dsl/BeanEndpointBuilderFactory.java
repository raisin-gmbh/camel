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
 * The bean component is for invoking Java beans from Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BeanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Bean component.
     */
    public interface BeanEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedBeanEndpointBuilder advanced() {
            return (AdvancedBeanEndpointBuilder) this;
        }
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder cache(Boolean cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder cache(String cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * Sets the name of the method to invoke on the bean.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * Used for configuring additional properties on the bean.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder parameters(Map<String, Object> parameters) {
            setProperty("parameters", parameters);
            return this;
        }
        /**
         * Used for configuring additional properties on the bean.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder parameters(String parameters) {
            setProperty("parameters", parameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Bean component.
     */
    public interface AdvancedBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BeanEndpointBuilder basic() {
            return (BeanEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder basicPropertyBinding(
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
        default AdvancedBeanEndpointBuilder basicPropertyBinding(
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
        default AdvancedBeanEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedBeanEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Bean (camel-bean)
     * The bean component is for invoking Java beans from Camel.
     * 
     * Syntax: <code>bean:beanName</code>
     * Category: core,java
     * Available as of version: 1.0
     * Maven coordinates: org.apache.camel:camel-bean
     */
    default BeanEndpointBuilder bean(String path) {
        class BeanEndpointBuilderImpl extends AbstractEndpointBuilder implements BeanEndpointBuilder, AdvancedBeanEndpointBuilder {
            public BeanEndpointBuilderImpl(String path) {
                super("bean", path);
            }
        }
        return new BeanEndpointBuilderImpl(path);
    }
}