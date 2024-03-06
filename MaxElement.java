package org.example.Lecture1;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int ans=maxElement(a);
        System.out.println("Maximum Element : "+ans);
    }
    static int maxElement(int a[]){ // 23 41 11 2 45
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        return max;
    }
}
