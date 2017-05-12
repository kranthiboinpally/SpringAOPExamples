package com.example;

import org.springframework.stereotype.Service;

@Service("logService")
public class LogService
{
    @LogExecutionTime
    public void calculatetime() throws InterruptedException
    {
        Thread.sleep(2000);
    }
}
