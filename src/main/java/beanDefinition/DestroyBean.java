package beanDefinition;

import org.springframework.beans.factory.DisposableBean;

public class DestroyBean implements DisposableBean {
    public void destroy() throws Exception {
        System.out.println("DestroyBean start method void destroy()");
    }
}
