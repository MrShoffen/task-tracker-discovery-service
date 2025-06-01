package org.mrshoffen.tasktracker.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaskTrackerDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerDiscoveryServiceApplication.class, args);
    }

}
