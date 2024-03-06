package org.example.Lecture1;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays : ");

        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Search Element : ");
        int x=sc.nextInt();

        int ans=serachelement(a,x);
        System.out.println("Element Position : "+ans);
    }

    static int serachelement(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i+1;
            }
        }
        return -1;
    }
}
