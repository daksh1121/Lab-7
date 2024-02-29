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
        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
}
