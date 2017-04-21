package plujezi.spring.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest/api")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
//        register(HelloEndpoint.class);
        packages("plujezi.spring.example.endpoint");
    }
}
