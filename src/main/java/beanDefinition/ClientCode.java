package beanDefinition;

import beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /*2ая лекция*/
        Developer intern = context.getBean("dev", Developer.class);
        System.out.println(intern.toString());
    }
}
