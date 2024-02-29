package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            result.append(fizzBuzz(i));
            if (i != 100) {
                result.append(",");
            }
        }
        System.out.println(result);
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
