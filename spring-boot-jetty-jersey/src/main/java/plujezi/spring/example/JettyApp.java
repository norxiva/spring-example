package plujezi.spring.example;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@EnableAutoConfiguration
@SpringBootApplication
public class JettyApp extends SpringBootServletInitializer    {

    public static void main(String[] args){
        new JettyApp().configure(new SpringApplicationBuilder(JettyApp.class))
                .run(args);
    }
}
