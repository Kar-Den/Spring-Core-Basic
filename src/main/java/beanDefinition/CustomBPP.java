package beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBPP implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " START");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " END");
        return null;
    }
}
