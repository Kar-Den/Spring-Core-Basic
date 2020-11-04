package beanDefinition;

import beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Developer dev = (Developer) context.getBean("dev");
        System.out.println(dev.toString());

        Developer intern = context.getBean("intern", Developer.class);
        intern.setLevel(1);
        intern.setSkill("Kotlin");
        System.out.println(intern.toString());

        Developer net = (Developer) context.getBean("dotNetDev");
        System.out.println(net.toString());
    }
}
