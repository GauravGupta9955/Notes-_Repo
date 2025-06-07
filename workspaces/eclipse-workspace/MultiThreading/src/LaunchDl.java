class Warrior implements Runnable{
	
	String res1 = new String("Brhmastra");
	String res2 = new String("Pashupatastra");
	String res3 = new String("Sarpastra");

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			String s1 =Thread.currentThread().getName();
			if(s1.equals("Rama")) {
				ramaAcqRes();
			}
			else {
				ravanaAcqRes();
			}
		}
		catch(Exception e) {
			System.out.println("some interuption");
		}
	}
	public void ramaAcqRes() {
		try {
			Thread.sleep(4000);
			synchronized(res1) {
				System.out.println("Rama has acquired "+res1);
				Thread.sleep(4000);
				synchronized(res2) {
					System.out.println("Rama has acquired "+res2);
					Thread.sleep(4000);
					synchronized(res3) {
						System.out.println("Rama has acquired  "+res3);
					}
				}
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
   public void ravanaAcqRes() {
		
	   try {
			Thread.sleep(4000);
			synchronized(res3) {
				System.out.println("Ravana has acquired "+res2);
				Thread.sleep(4000);
				synchronized(res2) {
					System.out.println("Ravana has acquired "+res2);
					Thread.sleep(4000);
					synchronized(res1) {
						System.out.println("Ravana  has acquired "+res1);
					}
				}
			}
			
			
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class LaunchDl {
public static void main(String[] args) {
	Warrior w = new Warrior();
	Thread t1 =new Thread(w);
	Thread t2 =new Thread(w);
	t1.setName("Rama");
	t2.setName("Ravana");
	t1.start();
	t2.start();
}
}
