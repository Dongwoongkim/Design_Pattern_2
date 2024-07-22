package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component {

    private Component component;

    public TimeDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long currentTIme = System.currentTimeMillis();
        String result = component.operation();
        long resultTime = System.currentTimeMillis();
        log.info("time = {}ms", resultTime - currentTIme);
        return result;
    }
}
