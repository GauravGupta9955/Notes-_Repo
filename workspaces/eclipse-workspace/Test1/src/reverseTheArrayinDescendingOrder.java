import java.util.Arrays;

public class reverseTheArrayinDescendingOrder {
public static void main(String[] args) {
	int num[]= {3,4,5,6,9,2,9,4,5,6};
    Arrays.sort(num);
    int length = num.length-1;
    for(int i = length;i>=0;i--) 
    	System.out.print(num[i]+" ");
  
   
   
}
}
