package com.github.svfreitas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("DevOpsBox"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
