package com.gymhelper.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    private static final long TEST_ID = 13;
    private static final String TEST_CONTENT = "test content";
    
    private Greeting testSubject;
    
    public GreetingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.testSubject = new Greeting(GreetingTest.TEST_ID, GreetingTest.TEST_CONTENT);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Greeting.
     */
    @Test
    public void testGetId() {
        long expResult = GreetingTest.TEST_ID;
        long result = this.testSubject.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContent method, of class Greeting.
     */
    @Test
    public void testGetContent() {
        String expResult = GreetingTest.TEST_CONTENT;
        String result = this.testSubject.getContent();
        assertEquals(expResult, result);
    }
    
}
