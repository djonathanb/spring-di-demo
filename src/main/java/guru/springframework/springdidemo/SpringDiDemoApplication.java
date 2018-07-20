package guru.springframework.springdidemo;

import guru.springframework.springdidemo.controllers.ConstructorInjectedController;
import guru.springframework.springdidemo.controllers.MyController;
import guru.springframework.springdidemo.controllers.PropertyInjectedController;
import guru.springframework.springdidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
        MyController myController = ctx.getBean("myController", MyController.class);

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
