package com.github.svfreitas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello DevOpsBox", app.greet("DevOpsBox"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}