package javavenger;

import java.util.Scanner;

public class demo {


	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++){
	            	String s1 =sc.next();
	            	int x=sc.nextInt();
	                int count =0;
	                int z=x;
	                while(z>0){
	                  z=z/10;
	                  count=count+1;
	                }
	                String s = new String();
	                if(count<=2){
	                    s =Integer.toString(x);
	                    s='0'+s;
	                    x=Integer.parseInt(s);
	                    }
	                System.out.printf("%s   %s \n",s1,s);
	                //Complete this line
	                System.out.println("================================");
	                }
	                
	            }
	           

	    }


