package plujezi.spring.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JettyWithMybatisApp extends SpringBootServletInitializer    {

    public static void main(String[] args){
        new JettyWithMybatisApp().configure(new SpringApplicationBuilder(JettyWithMybatisApp.class))
                .run(args);
    }
}
