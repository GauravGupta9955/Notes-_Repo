import java.util.*;

//wap to generate random no. from the array
public class RandomNumberGenrationfromArray {
public static void main(String[] args) {
	Random random = new Random();
	ArrayList al = new ArrayList();
	int num[]= {4,82,90,45,9,45,89,889,78};
	int len = num.length;
	for(int i=0;i<=100;i++) {
		int j = random.nextInt(len);
		if(al.contains(j)) 
			continue;
		else if (al.size()==len)
		    break;
		
		else
			al.add(j);
		int temp = num[j];
		System.out.println(temp);
		
	}
}
}
