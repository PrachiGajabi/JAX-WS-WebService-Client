
package org.learning.globalweatherservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CityTemperatureImplService", targetNamespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", wsdlLocation = "http://localhost:8080/GlobalWeatherService/CityTemperature?wsdl")
public class CityTemperatureImplService
    extends Service
{

    private final static URL CITYTEMPERATUREIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CITYTEMPERATUREIMPLSERVICE_EXCEPTION;
    private final static QName CITYTEMPERATUREIMPLSERVICE_QNAME = new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "CityTemperatureImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GlobalWeatherService/CityTemperature?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CITYTEMPERATUREIMPLSERVICE_WSDL_LOCATION = url;
        CITYTEMPERATUREIMPLSERVICE_EXCEPTION = e;
    }

    public CityTemperatureImplService() {
        super(__getWsdlLocation(), CITYTEMPERATUREIMPLSERVICE_QNAME);
    }

    public CityTemperatureImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CITYTEMPERATUREIMPLSERVICE_QNAME, features);
    }

    public CityTemperatureImplService(URL wsdlLocation) {
        super(wsdlLocation, CITYTEMPERATUREIMPLSERVICE_QNAME);
    }

    public CityTemperatureImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CITYTEMPERATUREIMPLSERVICE_QNAME, features);
    }

    public CityTemperatureImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CityTemperatureImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CityTemperature
     */
    @WebEndpoint(name = "CityTemperatureImplPort")
    public CityTemperature getCityTemperatureImplPort() {
        return super.getPort(new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "CityTemperatureImplPort"), CityTemperature.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CityTemperature
     */
    @WebEndpoint(name = "CityTemperatureImplPort")
    public CityTemperature getCityTemperatureImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "CityTemperatureImplPort"), CityTemperature.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CITYTEMPERATUREIMPLSERVICE_EXCEPTION!= null) {
            throw CITYTEMPERATUREIMPLSERVICE_EXCEPTION;
        }
        return CITYTEMPERATUREIMPLSERVICE_WSDL_LOCATION;
    }

}
