package plujezi.spring.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JettyWithMybatisAppTest {

    @Inject
    private TestRestTemplate restTemplate;

    @Test
    public void say(){
        ResponseEntity<String> entity =  this.restTemplate.getForEntity("/rest/api/hello/say", String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void hi(){
        ResponseEntity<String> entity =  this.restTemplate
                .postForEntity("/rest/api/hello/hi?name=marry", "", String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
