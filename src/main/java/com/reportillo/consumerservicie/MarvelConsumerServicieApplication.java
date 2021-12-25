package com.reportillo.consumerservicie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Raul E. P. Alvarez
 */

@SpringBootApplication
@EnableFeignClients
public class MarvelConsumerServicieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarvelConsumerServicieApplication.class, args);
    }

}
