
package euler6;

import java.util.stream.IntStream;


public class Euler6 
{
    public static void main(String[] args) 
    {
        int n = 100; 

        int sumOfSquares = IntStream.rangeClosed(1, n)
                .map(i -> i * i)
                .sum(); 

        int squareOfSum = (int) Math.pow(IntStream.rangeClosed(1, n).sum(), 2); 

        int difference = squareOfSum - sumOfSquares; 

        System.out.println("Różnica: " + difference);
    }
}
 

