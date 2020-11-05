package beanDefinition;

import beans.AutomationTester;
import beans.Developer;
import beans.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /*2ая лекция*/
        Developer dev = context.getBean("dev", Developer.class);
        System.out.println(dev.toString());

        AutomationTester tester = context.getBean("tester", AutomationTester.class);
        System.out.println(tester.toString());

        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager.toString());

    }
}
