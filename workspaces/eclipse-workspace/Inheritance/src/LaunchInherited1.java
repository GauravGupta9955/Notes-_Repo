abstract class Plane {
	abstract public void fly(); 

	abstract public void takeOff() ;
	public void landing() {
		System.out.println("Plan is Landing");
	}

}

class CargoPlane extends Plane {
	
	public void fly() {
	       System.out.println("cargo plane flies at lower height");
		}
	
	public void takeOff() {
		System.out.println("Cargo plane requires longer runway to takeoff");
	}
}

class PassengerPlane extends Plane {
	public void fly() {
	       System.out.println("Passengerplane plane flies at medium height");
	   	}
	
	public void takeOff() {
		System.out.println("Passenger plane requires medium runway to takeOff");
	}

}

class FighterPlane extends Plane {
	public void fly() {
	       System.out.println("Fighter plane flies at high height");
	   	}
	
	public void takeOff() {
		System.out.println("Fighter plane requires short runway to takeOff");
	}

}

 class AirportAdmin{
	 

	public void call(Plane  cp) {
		cp.fly();
		cp.takeOff();
		
	}
	
}

public class LaunchInherited1 {

	public static void main(String[] args) {
		
		CargoPlane cp= new CargoPlane();
		FighterPlane fp =new FighterPlane(); 
		PassengerPlane pp =new PassengerPlane();
		
		
		AirportAdmin aa =new AirportAdmin();
		aa.call(cp);
		System.out.println(" ");
		aa.call(fp);
		System.out.println(" ");
		aa.call(pp);
			
		
	}

}
