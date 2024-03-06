package org.example.Lecture1;

import java.util.Scanner;

public class SumOFAllElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


        int ans=sumOfElement(a);
        System.out.println("Result :"+ans);
    }

    static int sumOfElement(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}
