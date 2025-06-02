package CodingQuestion;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ToFindTheGCDOfString {
	public static void main(String[] args) {
		 String input = "abcabcabc";
	        String input2= "abcabc";
	        String result =gcdOfStrings(input, input2);
	        System.out.println("GCD of String is s: " + result);
	}

	private static String gcdOfStrings(String input, String input2) {
		// TODO Auto-generated method stub
		
		if(!(input+input2).equals(input2+input))
		return "";
		
		int length=input.length(),length2=input2.length();
		while(length2!=0) {
			int temp=length2;
			length2=length%length2;
			length=temp;	
		}
		
		return input.substring(0,length);
	}	
}