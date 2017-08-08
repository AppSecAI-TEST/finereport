
package com.fr.hailian.webservice;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-08T15:22:48.138+08:00
 * Generated source version: 3.1.12
 * 
 */
 
public class SSOServiceSoap_SSOServiceSoap12_Server{

    protected SSOServiceSoap_SSOServiceSoap12_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SSOServiceSoap12Impl();
        String address = "http://10.0.6.19:8008/SSOService.asmx";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new SSOServiceSoap_SSOServiceSoap12_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
