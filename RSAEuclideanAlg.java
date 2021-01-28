//Raelyn Mendoza
//RSA 

import java.util.*; 
import java.lang.*; 
  
class RSAEuclideanAlg
{ 
   //  return array [d, x, y] such that gcd = gcd(a, b), da + yb = gcd
   public static int[] gcd(int a, int b) {
      if (b == 0)
         return new int[] { a, 1, 0 };

      int[] vals = gcd(b, a % b);
      int gcd = vals[0];
      int d = vals[2];
      int y = vals[1] - (a / b) * vals[2];
      return new int[] { gcd, d, y };
   }

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a: ");
        int a = input.nextInt();
      
      System.out.print("Enter b: ");
        int b = input.nextInt();
      
      int vals[] = gcd(a, b);
      System.out.println("gcd(" + a + ", " + b + ") = " + vals[0]);
      System.out.println(vals[1] + "(" + a + ") + " + vals[2] + "(" + b + ") = " + vals[0]);
      System.out.println("d equals: " + vals[1] + "," + " y equals: " + vals[2]);
   }
}