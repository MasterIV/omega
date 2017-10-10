package com.drawandupdate.omega;

import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Log
@Component
public class ScheduledTask {
    @Scheduled(cron = "*/10 * * * * *")
    public void tick() {
        log.info("Ticktock");
    }
}
