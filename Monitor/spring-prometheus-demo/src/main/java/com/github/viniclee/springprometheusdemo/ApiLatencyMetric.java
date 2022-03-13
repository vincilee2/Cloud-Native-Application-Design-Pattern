package com.github.viniclee.springprometheusdemo;

import java.time.Duration;

import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;

@Component
public class ApiLatencyMetric {
        // monitor api latency of service B
        private final Timer latencyTimer;

        private static final String apiRequestLatency = "api.request.latency";

        // monitor tp50 tp90 and tp99
        private final double[] percentiles = new double[]{0.5, 0.90, 0.99};

        public ApiLatencyMetric(MeterRegistry registry) {
            this.latencyTimer = Timer.builder(apiRequestLatency)
                .publishPercentiles(percentiles)
                .publishPercentileHistogram()
                .serviceLevelObjectives(Duration.ofMillis(1))
                .minimumExpectedValue(Duration.ofMillis(1))
                .maximumExpectedValue(Duration.ofMillis(300))
                .tag("service", "B")
                .register(registry);
        }

        public Timer GetLatencyTimer() {
            return this.latencyTimer;
        }
        
}