package com.JavaCore.ArrayImplementation;

import java.util.Scanner;

public class Concatinatearray {
    int n=10;
    String arr[]= new String[n];
    public void setArraysize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array you want");
        int num = sc.nextInt();
        n=num;
    }
    public void getArray(){
        System.out.println("Enter the array of String you want");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            arr[i]= sc.nextLine();
        }
    }
}

class Calc extends Concatinatearray {
    String ans ="";
//    String finalans ="";
    public void calculate(){
        setArraysize();
        getArray();
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==null){
                arr[i]="";
            }
            ans= arr[i]+ans;
        }
        //yo chai arr to string convert bhako string lai reverse garna garya hai !!
//        for(int i=0; i<ans.length();i++){
//            finalans = ans.charAt(i)+finalans;
//        }
        System.out.println("The concaticated array is "+ans);
    }
}

class Mainn{
    public static void main(String[] args) {
        Calc c = new Calc();
        c.calculate();
    }
}