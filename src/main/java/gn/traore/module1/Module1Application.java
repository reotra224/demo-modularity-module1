package gn.traore.module1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application {

    public static void main(String[] args) {
        // SpringApplication.run(Module1Application.class, args);
        new gn.traore.demo.modularity.Tester().direBonjour("TRAORE");
    }

}
