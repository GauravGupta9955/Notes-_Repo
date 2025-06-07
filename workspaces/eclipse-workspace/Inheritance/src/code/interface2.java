package code;

@FunctionalInterface
interface Alpha{
	void beta(); 
}

public class interface2 {
	public static void main(String[] args) {
		Alpha a =new Alpha() {

			@Override
			public void beta() {

            System.out.println("Beta Implementaion");
				
			}
		
	};
	a.beta();

}
}
