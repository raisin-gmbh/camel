/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.servlet.ServletEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends ServletEndpointConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authhost":
        case "authHost": target.setAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "connectionclose":
        case "connectionClose": target.setConnectionClose(property(camelContext, boolean.class, value)); return true;
        case "cookiehandler":
        case "cookieHandler": target.setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "copyheaders":
        case "copyHeaders": target.setCopyHeaders(property(camelContext, boolean.class, value)); return true;
        case "httpmethod":
        case "httpMethod": target.setHttpMethod(property(camelContext, org.apache.camel.http.common.HttpMethods.class, value)); return true;
        case "ignoreresponsebody":
        case "ignoreResponseBody": target.setIgnoreResponseBody(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "okstatuscoderange":
        case "okStatusCodeRange": target.setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "preservehostheader":
        case "preserveHostHeader": target.setPreserveHostHeader(property(camelContext, boolean.class, value)); return true;
        case "proxyauthscheme":
        case "proxyAuthScheme": target.setProxyAuthScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, int.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "throwExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}

