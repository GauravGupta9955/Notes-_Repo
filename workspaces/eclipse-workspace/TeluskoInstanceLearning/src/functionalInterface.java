@FunctionalInterface
interface Abc{
	int show(int i);
}
public class functionalInterface {
	public static void main(String[] args) {
		Abc obj =i->i*2;
		System.out.println(obj.show(40));
	}

}
