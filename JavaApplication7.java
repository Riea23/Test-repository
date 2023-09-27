/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
ublic class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =scn.nextInt();
        } 
        int count = 0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
         sum = sum+arr[j];
         if(sum<0){
             count++;
         }       
            }
        } 
        System.out.println(count);
          }
}

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author user
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
