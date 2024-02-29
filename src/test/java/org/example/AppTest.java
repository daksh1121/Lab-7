package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.fizzBuzz;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz(1));
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("FizzBuzz", fizzBuzz(15));

        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 && i%5 == 0) {
                assertEquals("FizzBuzz", fizzBuzz(i));
            } else if (i%3 == 0) {
                assertEquals("Fizz", fizzBuzz(i));
            } else if (i%5 == 0) {
                assertEquals("Buzz", fizzBuzz(i));
            } else {
                assertEquals(Integer.toString(i), fizzBuzz(i));
            }
        }
    }
}
