package net.sayurinana.server.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.sayurinana.server.api.dao")
public class apiApplication {
    public static void main(String[] args) {
        SpringApplication.run(apiApplication.class, args);
    }
}