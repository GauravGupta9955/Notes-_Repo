package javavenger;
class mobile{
	static  String name;
	int price;
	String brand;
	public void show(){
		System.out.println(name+":"+brand);
	}
}

public class Static {
	public static void main(String[] args) {
		mobile obj1 =new mobile();
		mobile obj2=new mobile();
		obj1.name="smarphone";
		obj1.brand="samsung";
		obj1.price=15000;
		obj2.name="phone";
		obj2.brand="Oppo";
		obj2.price=17000;
		
		obj1.show();
		obj2.show();
		
	}

}
