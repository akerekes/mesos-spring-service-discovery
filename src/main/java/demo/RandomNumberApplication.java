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
		SpringApplication.run(RandomNumberApplication.class, args);
    }
}
