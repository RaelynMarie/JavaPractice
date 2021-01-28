import java.io.*;
import java.util.*;

public class BinSearchMerge{

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int size1 = in.nextInt();       
       int arr1[] = new int[size1];
       for(int i=0; i<arr1.length;i++){
         arr1[i]= in.nextInt();
       }
       
       int size2 = in.nextInt();
       int arr2[] = new int[size2];
       for(int i=0; i<arr2.length;i++){
         arr2[i]= in.nextInt();
       }
       
       int[] arr3 = new int[size1+size2];
       
       binSearchMerge(arr1, arr2, arr3);
       for (int i=0; i < size1+size2; i++){ 
         System.out.print(arr3[i] + " ");
       }
       
    }//end of main
    
    public static int[] binSearchMerge(int[] arr1, int[] arr2, int[] arr3){
      int i=0, j=0, k=0;
      while(i<arr1.length && j<arr2.length){
         if (arr1[i] < arr2[j]){
            arr3[k] = arr1[i];
            k++;
            i++;
         }else{
            arr3[k] = arr2[j];
            k++;
            j++;
         } 
      } 
       
        while (i < arr1.length)
        { 
            arr3[k] = arr1[i];
            k++;
            i++;
        } 
      
        while (j < arr2.length)
        {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
      return arr3;
    }//end of binSearchMerge()
}