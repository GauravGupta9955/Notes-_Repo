import java.util.*;
// to find the multiplication of highest two digit from
// this array int []arr={3,4,5,6,9,11,9,0} output will be 99
public class Test1234  {
	
	
	public static void main(String[] args) 
	{
		List <Integer> num = Arrays.asList(3,4,5,6,9,11,9,0);
		int largestValue=num.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		int SecondValue=num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		int sum=largestValue*SecondValue;
        System.out.println(sum);	
		
		
	}
	

	

	
}

