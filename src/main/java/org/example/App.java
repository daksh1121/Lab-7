package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }

    public static String fizzBuzz(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(input);
    }
}
