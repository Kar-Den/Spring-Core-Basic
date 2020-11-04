package beanDefinition;

import beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Developer dev = (Developer) context.getBean("dev");
        System.out.println(dev.toString());
    }
}
