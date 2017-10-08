
package org.learning.globalweatherservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CityTemperature", targetNamespace = "http://GlobalWeatherService.ashish4java.blogspot.in/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CityTemperature {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws CityNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTemperatureOfCity", targetNamespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", className = "org.learning.globalweatherservice.GetTemperatureOfCity")
    @ResponseWrapper(localName = "getTemperatureOfCityResponse", targetNamespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", className = "org.learning.globalweatherservice.GetTemperatureOfCityResponse")
    public String getTemperatureOfCity(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws CityNotFoundException_Exception
    ;

}
