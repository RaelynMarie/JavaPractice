import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinSearchMinGuesses
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int low = in.nextInt();
      int high = in.nextInt();
      
      if(low > high)
      {
         int temp = low;
         low = high;
         high = temp;
      }
      
      System.out.print("The number of guesses are: " + numGuesses(low, high));
    }
    
    public static int numGuesses(int low, int high)
    {
      int n = (high - low) + 1;
      int guessCount = ((int)(Math.log(n) / Math.log(2)))+1; 
  
      return guessCount; 
    }
}