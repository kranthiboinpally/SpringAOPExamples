package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.LogService;
import com.example.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAOPTest
{

    @Autowired
    UserService userService;

    @Autowired
    LogService  logService;

    @Test
    public void test()
    {
        userService.doTask(2, 3);
    }

    @Test
    public void testExecutionTime() throws InterruptedException
    {
        logService.calculatetime();
    }

}
