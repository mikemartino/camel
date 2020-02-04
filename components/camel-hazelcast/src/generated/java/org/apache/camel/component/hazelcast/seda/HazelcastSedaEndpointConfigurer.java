/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.seda;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastSedaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "defaultOperation": ((HazelcastSedaEndpoint) target).setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "hazelcastInstance": ((HazelcastSedaEndpoint) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastInstanceName": ((HazelcastSedaEndpoint) target).setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((HazelcastSedaEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((HazelcastSedaEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((HazelcastSedaEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((HazelcastSedaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((HazelcastSedaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((HazelcastSedaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "concurrentConsumers": ((HazelcastSedaEndpoint) target).getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "onErrorDelay": ((HazelcastSedaEndpoint) target).getConfiguration().setOnErrorDelay(property(camelContext, int.class, value)); return true;
        case "pollTimeout": ((HazelcastSedaEndpoint) target).getConfiguration().setPollTimeout(property(camelContext, int.class, value)); return true;
        case "transacted": ((HazelcastSedaEndpoint) target).getConfiguration().setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transferExchange": ((HazelcastSedaEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "defaultoperation": ((HazelcastSedaEndpoint) target).setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "hazelcastinstance": ((HazelcastSedaEndpoint) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename": ((HazelcastSedaEndpoint) target).setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((HazelcastSedaEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((HazelcastSedaEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((HazelcastSedaEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((HazelcastSedaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((HazelcastSedaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((HazelcastSedaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers": ((HazelcastSedaEndpoint) target).getConfiguration().setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "onerrordelay": ((HazelcastSedaEndpoint) target).getConfiguration().setOnErrorDelay(property(camelContext, int.class, value)); return true;
        case "polltimeout": ((HazelcastSedaEndpoint) target).getConfiguration().setPollTimeout(property(camelContext, int.class, value)); return true;
        case "transacted": ((HazelcastSedaEndpoint) target).getConfiguration().setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transferexchange": ((HazelcastSedaEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
