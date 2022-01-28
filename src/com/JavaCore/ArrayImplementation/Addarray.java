package com.JavaCore.ArrayImplementation;

import java.util.Scanner;


public class Addarray {
    int[] arr = new int[10];
    public void getArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of item you want to insert in the array");
        Integer n = sc.nextInt();
        System.out.println("Enter tha number in array.");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
}

class Baccha extends Addarray {
    int sum=0;
    public void calculate(){

        getArr();
        for(int i=0; i<arr.length; i++){
            sum = arr[i]+sum;
        }
        System.out.println("the sum of the array's element is"+sum);
    }
}

class Main {
    public static void main(String[] args) {
        Baccha b = new Baccha();
        b.calculate();

    }
}