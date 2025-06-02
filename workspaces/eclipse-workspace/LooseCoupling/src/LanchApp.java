import services.Java;
import services.SpringBoot;
import services.Tshaped;

public class LanchApp {
public static void main(String[] args) {
	Tshaped t = new Tshaped();
	t.setCourse(new Java());
	//t.setCourse(new SpringBoot());
	Boolean status=t.buyTheCourse(4999.96);
	if(status)
		System.out.println("success");
	else
		System.out.println("failed to get course");
}
}
