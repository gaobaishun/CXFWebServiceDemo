package testCXF;

import javax.xml.ws.Endpoint;

/**
 * @description: test
 * @author: gaobaishun
 * @create: 2018-12-10 21:11
 **/
public class WebService  {
    public static void main(String[] args) {
        System.out.println("web service start");
        CalculatorServiceImpl implementor = new CalculatorServiceImpl();
        String address = "http://localhost:8080/calculator";
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}
