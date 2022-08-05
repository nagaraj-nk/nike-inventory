package com.nike.inventory.cron;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class ScheduledJobs {

    @Scheduled(cron = "*/5 * * * * *")
    public void cronJobEveryFiveSeconds() {
        System.out.println(new Date().toString());
    }
}
