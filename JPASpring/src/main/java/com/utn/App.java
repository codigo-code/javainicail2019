package com.utn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories
public class App 
{
    public static void main( String[] args )
    {
    	
    	SpringApplication.run(App.class, args);
    }
}
