/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.webhook;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebhookEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebhookEndpoint target = (WebhookEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "webhookautoregister":
        case "webhookAutoRegister": target.getConfiguration().setWebhookAutoRegister(property(camelContext, boolean.class, value)); return true;
        case "webhookbasepath":
        case "webhookBasePath": target.getConfiguration().setWebhookBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "webhookcomponentname":
        case "webhookComponentName": target.getConfiguration().setWebhookComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "webhookexternalurl":
        case "webhookExternalUrl": target.getConfiguration().setWebhookExternalUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "webhookpath":
        case "webhookPath": target.getConfiguration().setWebhookPath(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

