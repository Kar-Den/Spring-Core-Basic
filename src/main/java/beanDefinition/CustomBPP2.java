package beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBPP2 implements BeanPostProcessor, Ordered {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean2 " + s + " START");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean2 " + s + " END");
        return o;
    }

    public int getOrder() {
        return 0;
    }
}
