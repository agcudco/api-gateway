package ec.edu.espe.msmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsMasterApplication.class, args);
    }

}
