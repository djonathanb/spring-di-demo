package guru.springframework.springdidemo;

import guru.springframework.springdidemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
        MyController myController = ctx.getBean("myController", MyController.class);
        myController.hello();
    }
}
