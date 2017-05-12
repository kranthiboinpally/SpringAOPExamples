package com.example;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService
{
    public void doTask(int a, int b)  {
        System.out.println("Multiply a and b:"+a*b);
    }
}
