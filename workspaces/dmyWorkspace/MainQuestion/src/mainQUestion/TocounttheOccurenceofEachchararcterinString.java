package mainQUestion;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class TocounttheOccurenceofEachchararcterinString {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the character");
    String str1 =sc.next();
    int leng =str1.length();
    
    LinkedHashMap<String,Integer> mapCount = new LinkedHashMap<String,Integer>();
    for(int i=0;i<leng;i++) {
    	if(mapCount.containsKey(String.valueOf(str1.charAt(i))))
    		mapCount.put(String.valueOf(str1.charAt(i)), mapCount.get(String.valueOf(str1.charAt(i)))+1);
    	else
    		mapCount.put(String.valueOf(str1.charAt(i)), 1);
    }
    mapCount.forEach((key,value)->System.out.println(key+":"+value));;
}}
