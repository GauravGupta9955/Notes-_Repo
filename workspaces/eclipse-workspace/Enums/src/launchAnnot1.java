import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
	
	String gameName() default "Cricket";
	int runs() default 2000;
	
}
@CricketPlayer
class Virat{
	private String name;
	private int age;
	
	public void disp() {
		System.out.println("virat is Indian");
	}
}
public class launchAnnot1 {
	public static void main(String[] args) {
		Virat v = new Virat();
		v.disp(); 
	}

}
