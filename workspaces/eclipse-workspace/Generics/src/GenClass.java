
class Gen<T>{
	T obj; 
	Gen(T obj){
		this.obj=obj;
	}
	public void show() {
		System.out.println("The type of object is:" + obj.getClass().getName());
	}
	public T getObject() {
		return obj;
	}
}
public class GenClass {
public static void main(String[] args) {
	Gen<String> g1 =new Gen<String>("gupta");
	g1.show();
	System.out.println(g1.getObject());
	
	
	Gen<Integer> g2 =new Gen<Integer>(10);
	g2.show();
	System.out.println(g1.getObject());
}
}
