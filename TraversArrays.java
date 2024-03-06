package org.example.Lecture1;

import java.util.Scanner;

public class TraversArrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        printArrays(a);
    }

    static void printArrays(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
