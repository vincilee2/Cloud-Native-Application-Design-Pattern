package com.github.viniclee.springprometheusdemo;

import io.micrometer.core.instrument.config.MeterFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricConfig {

    @Bean
    public MeterFilter meterFilter() {
        return MeterFilter.deny(
                (id) -> !id.getName().startsWith("api")
            );
    }
}
