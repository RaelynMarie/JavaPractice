//Palindrome Class work
//Raelyn Mendoza

import java.util.Scanner;

public class isPalindrome
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String a = "quit";
      
      while(true)
      {
         System.out.println("To stop the program, enter quit."); 
         System.out.print("Enter a word: ");
         String word = in.nextLine();
         if(word.equalsIgnoreCase(a))
         {
            break;
         }
         if(isPal(word))
         {
            System.out.println(word + " is a palindrome!");
         }
         else
         {
            System.out.println(word + " is not a palindrome!");
         }
      }
   }
   
   public static boolean isPal(String word)
   {
      if(word.length() <= 1)
      {
         return true;
      }
      else if(word.charAt(0) != word.charAt(word.length()-1))
      {
         return false;
      }
      else
      {
         return isPal(word.substring(1,word.length()-1));
      }
   }
}