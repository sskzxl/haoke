package com.ssk.haoke.center.houseResources.svr;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HouseResourcesApp { public static void main(String[] args) {
    new SpringApplicationBuilder(HouseResourcesApp.class)
            .web(WebApplicationType.NONE) // 非 Web 应用
            .run(args);
    }
}
