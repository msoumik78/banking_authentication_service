package init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"controller", "model", "service", "util"})
@EnableJpaRepositories("dao")
@EntityScan("model")
public class AuthenticationSpringBootStarterApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationSpringBootStarterApp.class, args);
    }

}
