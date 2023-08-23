package com.restapi;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RandomHealthIndicator implements HealthIndicator {
long start=System.currentTimeMillis();
@Override
public Health health() {
//double chance = ThreadLocalRandom.current().nextDouble();
long end=System.currentTimeMillis();
long t=(end-start)/1000;
   	System.out.println(t);
Health.Builder status = Health.up();
if (t>20) {
status = Health.down();
       }
return status.build();
   }
}

