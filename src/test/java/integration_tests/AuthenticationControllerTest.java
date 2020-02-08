package integration_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthenticationControllerTest {

    @LocalServerPort
    private int port;
    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();
    @Test
    public void testValidCredentials() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        //ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/students"), HttpMethod.POST, entity, String.class);
        //String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);
        //assertTrue(actual.contains("/students"));
    }

}
