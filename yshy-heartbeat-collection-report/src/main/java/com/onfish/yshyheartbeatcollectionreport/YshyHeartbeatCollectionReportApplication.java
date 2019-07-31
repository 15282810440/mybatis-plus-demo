package com.onfish.yshyheartbeatcollectionreport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.onfish.yshyheartbeatcollectionreport.mapper")
public class YshyHeartbeatCollectionReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshyHeartbeatCollectionReportApplication.class, args);
    }

}
