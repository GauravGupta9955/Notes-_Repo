package clone12;

class Cat1 implements Cloneable{
	int i;
	Cat1(int i){
	this.i=i;
	}
}
class Dog2 implements Cloneable{
	Cat1 cat;
	int j;
	
	Dog2(Cat1 cat, int j){
		this.cat=cat;
		this.j =j;
	}
	
	@Override//clone is protect method so we need to override it.
	public Object clone()throws CloneNotSupportedException{
		Cat1 c1 = new Cat1(cat.i);
		Dog2 d = new Dog2(c1,c1.i);
		return d ;
		}
	
}
public class DeepCopy {
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

