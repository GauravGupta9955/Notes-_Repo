package code;
class Laptop{
	String model;
	int price;
	public String toString() {
		return (model+":" +":" +price);
	}
	public Boolean equals(Laptop that) {
		if(this.model.equals(that.model)) 
			return true;
		else
			return false;
	}
}
public class Object {
public static void main(String[] args) {
	Laptop obj1 =new Laptop();
	obj1.model="Apple";
	obj1.price=30000;
	
	Laptop obj2 =new Laptop();
	obj2.model="Lenevo";
	obj2.price=30000;
	boolean result =obj1.equals(obj2);
	System.out.println(result);
	System.out.println(obj1.toString());
	
}
}
