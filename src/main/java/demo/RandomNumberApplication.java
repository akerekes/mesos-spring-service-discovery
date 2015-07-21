package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableEurekaClient
public class RandomNumberApplication {

    public static void main(String[] args) {

		if (true) {
			throw new RuntimeException("intentionally creating a failure");
		}
		SpringApplication.run(RandomNumberApplication.class, args);
    }
}
