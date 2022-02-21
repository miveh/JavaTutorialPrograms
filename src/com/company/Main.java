package com.company;

import java.util.Scanner;

public class Main {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void fibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibo(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or number: ");
        String original = in.nextLine();


        System.out.println(original);
        palindrome(original);

        //        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = s.nextInt();
//        if (isPrime(n)) {
//            System.out.println(n + " is a prime number");
//        } else {
//            System.out.println(n + " not a prime number");
//        }

//       int count = 10;
//       System.out.print(n1+" "+n2);
//       fibo(count-2);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void palindrome(String original){
        String reverse="";
        int length = original.length();
        System.out.println(length);
        for(int i=length-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
            System.out.println(i+", "+reverse);
        }

        System.out.println(reverse);
        if (original.equals(reverse)){
            System.out.println(original+" is a palindrome number");
        }else{
            System.out.println(original+" is not a palindrome number.");
        }
    }
}
