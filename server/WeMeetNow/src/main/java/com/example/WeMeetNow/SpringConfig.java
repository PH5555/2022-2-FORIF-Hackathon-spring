package com.example.WeMeetNow;

import com.example.WeMeetNow.Repository.AvailableDateRepository;
import com.example.WeMeetNow.restservice.DefaultAvailableDateRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public AvailableDateRepository availableDateRepository() {
        return new DefaultAvailableDateRepository();
    }

}