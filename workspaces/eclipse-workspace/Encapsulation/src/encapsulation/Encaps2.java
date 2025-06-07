package encapsulation; 

class Fan{
	private int cost;
	private String brand;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}

public class Encaps2 {
	public static void main(String[] args) {
		Fan f1 =new Fan();
		f1.setBrand("usha");
		f1.setCost(1000);
		System.out.println(f1.getBrand());
		System.out.println(f1.getCost());
		
	}

}
