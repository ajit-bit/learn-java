/*import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int number []=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("here is the number you have entered");
        for(int i=0;i<=size;i++){

        System.out.println(number[i]);
    }
}
}

import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int number []=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("enter the number to find");
        int x=sc.nextInt();
        for(int i=0;i<number.length;i++){

            if(number[i] == x){
                System.out.println("found "+i);
            }
        
    }
}
}
/* */
// 2D array
/* 
import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the rows");
         int row =sc.nextInt();
         System.out.println("enter the column");
         int col =sc.nextInt();
         int [][]number=new  int[row][col];
         //input 
         //rows
         for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            number[i][j]=sc.nextInt();
        }
        }
        System.out.println("enter the number to find");
        int x=sc.nextInt();
         //output
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print( number[i][j]+" ");      
            }
            System.out.println();
        }
    }
}*/

import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the rows");
         int row =sc.nextInt();
         System.out.println("enter the column");
         int col =sc.nextInt();
         int [][]number=new  int[row][col];
         //input 
         //rows
         for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            number[i][j]=sc.nextInt();
        }
        }
        System.out.println("enter the number to find");
        int x=sc.nextInt();
         //output
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                      if (x == number[i][j]) {
                        System.out.println("num found at "+i+" "+j);
                        
                      }
            }
        }
    }
}