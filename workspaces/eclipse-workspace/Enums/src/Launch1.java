enum Result1{
	PASS,FAIL, NR;
}
public class Launch1 {
public static void main(String[] args) {
	Result1 r = Result1.PASS;
	
	switch(r) {
	case PASS:
		System.out.println("pass");
		break;
	case FAIL:
		System.out.println("fail");
		break;
	case NR:
		System.out.println("NR");
		break;
	default:
		System.out.println("Invalid Input");
		break;
	}
}
}
