package com.lanja.wikiselfmade.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.lanja")
@SpringBootApplication
public class WikiSelfMadeApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiSelfMadeApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(WikiSelfMadeApplication.class, args);

        SpringApplication app = new SpringApplication(WikiSelfMadeApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}