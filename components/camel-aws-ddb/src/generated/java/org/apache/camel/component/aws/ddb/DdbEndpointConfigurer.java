/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ddb;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DdbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "amazonDDBClient": ((DdbEndpoint) target).getConfiguration().setAmazonDDBClient(property(camelContext, com.amazonaws.services.dynamodbv2.AmazonDynamoDB.class, value)); return true;
        case "consistentRead": ((DdbEndpoint) target).getConfiguration().setConsistentRead(property(camelContext, boolean.class, value)); return true;
        case "keyAttributeName": ((DdbEndpoint) target).getConfiguration().setKeyAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "keyAttributeType": ((DdbEndpoint) target).getConfiguration().setKeyAttributeType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((DdbEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((DdbEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.ddb.DdbOperations.class, value)); return true;
        case "proxyHost": ((DdbEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((DdbEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((DdbEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "readCapacity": ((DdbEndpoint) target).getConfiguration().setReadCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "region": ((DdbEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "writeCapacity": ((DdbEndpoint) target).getConfiguration().setWriteCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "basicPropertyBinding": ((DdbEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DdbEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accessKey": ((DdbEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((DdbEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "amazonddbclient": ((DdbEndpoint) target).getConfiguration().setAmazonDDBClient(property(camelContext, com.amazonaws.services.dynamodbv2.AmazonDynamoDB.class, value)); return true;
        case "consistentread": ((DdbEndpoint) target).getConfiguration().setConsistentRead(property(camelContext, boolean.class, value)); return true;
        case "keyattributename": ((DdbEndpoint) target).getConfiguration().setKeyAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "keyattributetype": ((DdbEndpoint) target).getConfiguration().setKeyAttributeType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((DdbEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((DdbEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.ddb.DdbOperations.class, value)); return true;
        case "proxyhost": ((DdbEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((DdbEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((DdbEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "readcapacity": ((DdbEndpoint) target).getConfiguration().setReadCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "region": ((DdbEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "writecapacity": ((DdbEndpoint) target).getConfiguration().setWriteCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "basicpropertybinding": ((DdbEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DdbEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accesskey": ((DdbEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((DdbEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
