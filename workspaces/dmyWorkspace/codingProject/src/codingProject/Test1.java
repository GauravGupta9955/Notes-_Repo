package codingquestion;

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
class Solut {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) {
        	return "";
        }
        
        int gcd= gcdofString(str1.length(),str2.length());
		return str1.substring(0,gcd);
    }

	private int gcdofString(int length, int length2) {
		// TODO Auto-generated method stub
		
		while(length2!=0) {
			int temp=length2;
			length2=length%length2;
			length=temp;
			
		}
		return length;
	}
}


public class Test1 {

    public static void main(String[] args) {
        String input = "abcabcabc";
        String input2= "abcabc";
        Solut sol = new Solut();
        String result =sol.gcdOfStrings(input, input2);
        System.out.println("Longest substring without repeating characters: " + result);
    }

}
