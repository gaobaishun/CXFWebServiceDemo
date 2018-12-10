package testCXF;

import javax.jws.WebService;

/**
 * @description: the service impl
 * @author: gaobaishun
 * @create: 2018-12-10 21:10
 **/
@WebService(endpointInterface="testCXF.CalculatorService",serviceName="calculator")
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @Override
    public String concat(String a, String b) {
        return a + b;
    }
}
