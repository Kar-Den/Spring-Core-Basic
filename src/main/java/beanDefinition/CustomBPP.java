package beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBPP implements BeanPostProcessor, Ordered {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " START");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " END");
        return o;
    }

    public int getOrder() {
        return 1;
    }
}
