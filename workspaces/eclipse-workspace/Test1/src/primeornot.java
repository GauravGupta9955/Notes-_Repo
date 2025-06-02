import java.util.Scanner;

public class primeornot {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	boolean bool = primeOrNot(n);
	if(bool)
		System.out.println("prime no");
	else
		System.out.println("not Prime");
}

private static boolean primeOrNot(int sca) {
    if(sca ==0 || sca ==1)
    return false;
    else if(sca==2)
    return true;
    int c=2;
    while(c<sca){
        if(sca%c==0){
        return false;
        }
        c++;
    }
    
    return true;
     
     
     
 }
}
