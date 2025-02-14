package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeProxy extends ConcreteLogic {

    private ConcreteLogic concreteLogic;

    public TimeProxy(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    @Override
    public String operation() {
        log.info("TimeProxy 실행");
        long currentTime = System.currentTimeMillis();
        String result = concreteLogic.operation();
        long resultTime = System.currentTimeMillis();
        log.info("실행 시간 = {}ms", resultTime - currentTime);
        return result;
    }
}
