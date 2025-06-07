package services;

public class LaunchApp {
public static void main(String[] args) {
	TShapedSkills t = new TShapedSkills();
	t.setCourse(new Java());
	Boolean status=t.buyTheCourse(499.4);
	if(status)
		System.out.println("success");;
}
}
