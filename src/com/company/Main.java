package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static int n1 = 0, n2 = 1, n3 = 0; //for fibonacci method



    public static void main(String[] args) {
        //step7

        //step6
//        System.out.println("1st Random Number: " + Math.random());
//        System.out.println("2nd Random Number: " + Math.random());
//        System.out.println("3rd Random Number: " + Math.random());
//        System.out.println("4th Random Number: " + Math.random());
//        Random random = new Random();
//        int x = random.nextInt(50);
//        System.out.println(x);
//        boolean random_bool = ThreadLocalRandom.current().nextBoolean();
//        System.out.print(random_bool);


        //step4 test
//        String o = "153";
//        boolean armstrong = isArmStrong(o);
//        if(armstrong == true)
//            System.out.println(o+ " is a armstrong.");
//        else
//            System.out.println(o+ " is not a armstrong.");

        //step3 test
//        int fact=1;
//        fact = factorial(5);
//        System.out.println(fact);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string or number: ");
//        String original = in.nextLine();
//        palindrome(original);

        //step2 test
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = s.nextInt();
//        if (isPrime(n)) {
//            System.out.println(n + " is a prime number");
//        } else {
//            System.out.println(n + " not a prime number");
//        }

        //step1 test
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

    public static int factorial(int number) {
        if(number==0)
            return 1;
        else
            return number * factorial(number - 1);
    }

    static boolean isArmStrong(String number){
        int plus_perfect=0;
        System.out.println(number.length());

        for (int i=number.length() -1; i>=0; i--){
//            System.out.println(number.length());
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            System.out.print("\n"+n+"\n");
            plus_perfect = (int) (plus_perfect + Math.pow(n, number.length()));
            System.out.println(plus_perfect);

        }
        if (plus_perfect == Integer.parseInt(number))
            return true;
        else
            return false;
    }

    static void fibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibo(count - 1);
        }
    }

}
