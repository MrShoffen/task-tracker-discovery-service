package org.mrshoffen.tasktracker.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer

public class TaskTrackerDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerDiscoveryServiceApplication.class, args);
    }

}
