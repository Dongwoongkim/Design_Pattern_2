package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    public void noProxy() throws Exception {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);
        concreteClient.execute();
    }

    @Test
    public void addProxy() throws Exception {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(new TimeProxy(concreteLogic));
        concreteClient.execute();
    }
}
