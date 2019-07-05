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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Camel WebSocket using JSR356 (javax)
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JSR356WebSocketEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Javax Websocket component.
     */
    public interface JSR356WebSocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedJSR356WebSocketEndpointConsumerBuilder advanced() {
            return (AdvancedJSR356WebSocketEndpointConsumerBuilder) this;
        }
        /**
         * the servlet context to use (represented by its path).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointConsumerBuilder context(String context) {
            setProperty("context", context);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointConsumerBuilder sessionCount(
                int sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointConsumerBuilder sessionCount(
                String sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default JSR356WebSocketEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default JSR356WebSocketEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Javax Websocket
     * component.
     */
    public interface AdvancedJSR356WebSocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default JSR356WebSocketEndpointConsumerBuilder basic() {
            return (JSR356WebSocketEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedJSR356WebSocketEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedJSR356WebSocketEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedJSR356WebSocketEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedJSR356WebSocketEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
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
        default AdvancedJSR356WebSocketEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointConsumerBuilder synchronous(
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
        default AdvancedJSR356WebSocketEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Javax Websocket component.
     */
    public interface JSR356WebSocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedJSR356WebSocketEndpointProducerBuilder advanced() {
            return (AdvancedJSR356WebSocketEndpointProducerBuilder) this;
        }
        /**
         * the servlet context to use (represented by its path).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointProducerBuilder context(String context) {
            setProperty("context", context);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointProducerBuilder sessionCount(
                int sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointProducerBuilder sessionCount(
                String sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JSR356WebSocketEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JSR356WebSocketEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Javax Websocket
     * component.
     */
    public interface AdvancedJSR356WebSocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default JSR356WebSocketEndpointProducerBuilder basic() {
            return (JSR356WebSocketEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJSR356WebSocketEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointProducerBuilder synchronous(
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
        default AdvancedJSR356WebSocketEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Javax Websocket component.
     */
    public interface JSR356WebSocketEndpointBuilder
            extends
                JSR356WebSocketEndpointConsumerBuilder, JSR356WebSocketEndpointProducerBuilder {
        default AdvancedJSR356WebSocketEndpointBuilder advanced() {
            return (AdvancedJSR356WebSocketEndpointBuilder) this;
        }
        /**
         * the servlet context to use (represented by its path).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointBuilder context(String context) {
            setProperty("context", context);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointBuilder sessionCount(int sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
        /**
         * Used when the endpoint is in client mode to populate a pool of
         * sessions.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default JSR356WebSocketEndpointBuilder sessionCount(String sessionCount) {
            setProperty("sessionCount", sessionCount);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Javax Websocket component.
     */
    public interface AdvancedJSR356WebSocketEndpointBuilder
            extends
                AdvancedJSR356WebSocketEndpointConsumerBuilder, AdvancedJSR356WebSocketEndpointProducerBuilder {
        default JSR356WebSocketEndpointBuilder basic() {
            return (JSR356WebSocketEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJSR356WebSocketEndpointBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointBuilder basicPropertyBinding(
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
        default AdvancedJSR356WebSocketEndpointBuilder synchronous(
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
        default AdvancedJSR356WebSocketEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Javax Websocket (camel-websocket-jsr356)
     * Camel WebSocket using JSR356 (javax)
     * 
     * Syntax: <code>websocket-jsr356:websocketPathOrUri</code>
     * Category: jsr356
     * Available as of version: 2.23
     * Maven coordinates: org.apache.camel:camel-websocket-jsr356
     */
    default JSR356WebSocketEndpointBuilder jSR356WebSocket(String path) {
        class JSR356WebSocketEndpointBuilderImpl extends AbstractEndpointBuilder implements JSR356WebSocketEndpointBuilder, AdvancedJSR356WebSocketEndpointBuilder {
            public JSR356WebSocketEndpointBuilderImpl(String path) {
                super("websocket-jsr356", path);
            }
        }
        return new JSR356WebSocketEndpointBuilderImpl(path);
    }
}