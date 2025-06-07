package javaNewCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class javaNewCode {

    public static void main(String[] args) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer");
        int i = scan.nextInt();
        System.out.println("enter Double");
        double d =scan.nextDouble();
        System.out.println("enter string");
        String s =reader.readLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}