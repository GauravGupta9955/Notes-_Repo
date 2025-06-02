package functInterface;
@FunctionalInterface
interface Sum{
	int add(int num1 , int num2);
}

public class lamdaWithTwoParameter {
 public static void main(String[] args) {
	 Sum add =(num1,num2)->num1+num2;
	 
	 System.out.println(add.add(5, 6));
	 
}
}
