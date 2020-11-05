package beanDefinition;

import beans.Developer;
import beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        Developer dev = (Developer) context.getBean("dev");
//        System.out.println(dev.toString());
//
//        Developer intern = context.getBean("intern", Developer.class);
//        intern.setLevel(1);
//        intern.setSkill("Kotlin");
//        System.out.println(intern.toString());
//
//        Developer net = (Developer) context.getBean("dotNetDev");
//        System.out.println(net.toString());
//
//        Developer anonymous = context.getBean("anonymous", Developer.class);
//        System.out.println(anonymous.toString());
//
//        Project taxiBumer = context.getBean("taxiBumer", Project.class);
//        System.out.println(taxiBumer.toString());
//
//        Project java_10 = (Project) context.getBean("java_10");
//        System.out.println(java_10.toString());

        /*2ая лекция*/
        Developer intern = context.getBean("scalaDev", Developer.class);
        intern.setSkill("Delphi");
        System.out.println(intern.toString());


        ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");

        Developer scalaDev = (Developer) context2.getBean("scalaDev");
        System.out.println(scalaDev.toString());

        System.out.println(intern==scalaDev);

    }
}
