import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinSearchGame{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int low = in.nextInt();
      int high = in.nextInt();
      int secretNum = in.nextInt();
      
      int temp = 0;
      
      if(low > high){
         temp = low;
         low = high;
         high = temp;
      }
      
      if(secretNum==low || secretNum==high){
         System.out.print(secretNum);
      }else{
         binarySearch(low,high,secretNum);
      }
   }//end of main
   
   public static void binarySearch(int low, int high, int secretNum){      
      
      int mid = (low+high)/2;
      
      while(mid != secretNum){
         if(secretNum > mid){
            System.out.print(mid + " ");
            low = mid +1;
            mid = (low+high)/2;
         }else if(secretNum < mid){
            System.out.print(mid + " ");
            high = mid-1;
            mid = (low+high)/2;
         }      
      } 
      System.out.print(mid);
 }//end of binarySearch()
}//end of class