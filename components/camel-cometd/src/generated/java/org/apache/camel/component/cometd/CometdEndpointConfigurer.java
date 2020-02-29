/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CometdEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CometdEndpoint target = (CometdEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": target.setAllowedOrigins(property(camelContext, java.lang.String.class, value)); return true;
        case "baseresource":
        case "baseResource": target.setBaseResource(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "crossoriginfilteron":
        case "crossOriginFilterOn": target.setCrossOriginFilterOn(property(camelContext, boolean.class, value)); return true;
        case "disconnectlocalsession":
        case "disconnectLocalSession": target.setDisconnectLocalSession(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterpath":
        case "filterPath": target.setFilterPath(property(camelContext, java.lang.String.class, value)); return true;
        case "interval": target.setInterval(property(camelContext, int.class, value)); return true;
        case "jsoncommented":
        case "jsonCommented": target.setJsonCommented(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loglevel":
        case "logLevel": target.setLogLevel(property(camelContext, int.class, value)); return true;
        case "maxinterval":
        case "maxInterval": target.setMaxInterval(property(camelContext, int.class, value)); return true;
        case "multiframeinterval":
        case "multiFrameInterval": target.setMultiFrameInterval(property(camelContext, int.class, value)); return true;
        case "sessionheadersenabled":
        case "sessionHeadersEnabled": target.setSessionHeadersEnabled(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

}

