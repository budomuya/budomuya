package com.budomuya.webservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.budomuya.webservice")
@ImportResource("classpath*:com/oxinews/servis/context/applicationContext.xml")
public class OXIConfiguration {


}