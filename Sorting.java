/*import java.util.*;
public class Sorting {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
    } 
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");     
        }
        System.out.println();
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        int arr[]={2,6,4,8,2,4};
        bubble(arr);
    printarray(arr);
}
}
*/

import java.util.Scanner;

public class Sorting {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }     
    }
    public static void main(String args[])
    {
       int arr[]={1,6,4,8,4};
        Selection(arr);
        printarray(arr);
    }
}

/* 
public class Sorting {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Insertion(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current < arr[j]) 
            {
                arr[j+1]=current;
            }
        }
        
    }
    public static void main(String[] args) {
int arr[]={1,2,5,9,1,6,4};
Insertion(arr);
printarray(arr);
    }
}*/