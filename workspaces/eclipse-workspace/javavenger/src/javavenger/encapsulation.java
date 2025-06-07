package javavenger;
class Human{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public String getname() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setName(String n) {
		name=n;
	}
}
public class encapsulation {
public static void main(String[] args) {
	Human obj1 =new Human();
	obj1.setAge(10);
	obj1.setName("Gaurav");
	int age =obj1.getAge();
	String name=obj1.getname();
	System.out.println(age);
	System.out.println(name);
}
}
