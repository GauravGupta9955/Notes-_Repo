package clone12;
class Cat{
	int i;
	Cat(int i){
	this.i=i;
	}
}
class Dog implements Cloneable{
	Cat cat;
	int j;
	
	Dog(Cat cat, int j){
		this.cat=cat;
		this.j =j;
	}
	
	@Override//clone is protect method so we need to override it.
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
		}
	
}
public class clone2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(10);
		Dog d = new Dog(c,20);
		
		Dog d1 =(Dog)d.clone();
		d1.cat.i=100;
		d1.j=200;
		
		System.out.println(d.cat.i +"==>"+d.j);
		System.out.println(d1.cat.i +"==>"+d1.j);
		
	}

}
