package com.example;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.AnnotationRunner;
import com.example.CanRun;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FunProjectApplicationTests
{

    @Test
    public void contextLoads()
    {

        AnnotationRunner runner = new AnnotationRunner();
        Method[] methods = runner.getClass().getMethods();

        for (Method method : methods)
        {
            // Get All the Annotations present in the class
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null)
            {
                try
                {
                    // Invoking method for the object
                    method.invoke(runner);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

}
