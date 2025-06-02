import java.util.Scanner;

public class fabinocciSeries {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	printFibonocci(n);
	
}

private static void printFibonocci(int n) {
	int a =0,b=1,c=1;
	
	for (int i=1;i<=n;i++) {
		System.out.print(a +", ");
		a=b;
		b=c;
		c=a+b;
	}
	
}
}
