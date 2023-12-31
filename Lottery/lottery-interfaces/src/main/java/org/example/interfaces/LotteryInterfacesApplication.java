package org.example.interfaces;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@Configurable
@MapperScan(basePackages = "org.example.infrastructure.dao")
@ComponentScan(basePackages = {"org.example.domain.strategy.service.algorithm.impl",
        "org.example.domain.strategy.service.draw.impl",
        "org.example.domain.strategy.repository",
        "org.example.domain.award",
        "org.example.domain.activity",
        "org.example.infrastructure.repository",
        "org.example.infrastructure.po",
        "org.example.process",
        "org.example.mq",
        "org.example.worker",
        "org.example.domain.support",
        "org.example.domain.activity.service.partake.impl",
        "org.example.domain.rule",
        "org.example.interfaces"
})
public class LotteryInterfacesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryInterfacesApplication.class, args);
    }

}
