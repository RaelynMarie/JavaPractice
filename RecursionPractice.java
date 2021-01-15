//Recursive Practice Homework
//Raelyn Mendoza

import java.util.Arrays;

public class RecursionPractice
{
   static String indent = "";   
   static long count = 0;

   public static void main(String[] args)
   {
      count = 0;
      int n = 20;
      System.out.println( "Sum of all values from 1 to " + n + " is: " + sum(n) );
      System.out.println( "recursions = " + count );

      count = 0; 
      n = 9;
      System.out.println( "fibonacci(" + n + ") is: " + fibonacci(n) );
      System.out.println( "recursions = " + count );
      
      count = 0; 
      n = 18;
      System.out.println( "fibonacci(" + n + ") is: " + fibonacci(n) );
      System.out.println( "recursions = " + count );
      
      count = 0; 
      n = 14;
      System.out.println( "factorial(" + n + ") is: " + factorial(n) );
      System.out.println( "recursions = " + count );
   }
   
   public static int factorial(int n)
   {
      count++;
      if(n == 0)
      {
         return 1;
      }
      else
      {
         return (n*factorial(n-1));
      }
   }

   public static int fibonacci(int n)
   {
      count++;
      
      if(n<=1)
      {
         return n;
      }
      else
      {
         return (fibonacci(n-1)+ fibonacci(n-2));
      }
   }
   
   public static int sum(int n)
   {
      count++;
      if (n == 0)
      {
         return 0;
      }
      else
      {
         return n + sum(n-1);
      }
      
   }
}