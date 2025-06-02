 package in.goolgle.communication;


class Producer extends Thread {
 	//producer producing the data in StringBuffer
 	StringBuffer sb;
 	
 	
 	public Producer() {
 		//StringBuffer object is Created with default value capacity 16
 		sb =new StringBuffer();
 	}

 	@Override
 	public void run() {
 		synchronized(sb) {
 		for(int i=1;i<=10;i++) {
 			sb.append(i + ":");
 			try {
 				Thread.sleep(1000);
 				System.out.println("appending");
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
 		sb.notify();
 		}
 	}
 }

 class Consumer extends Thread {
 	
 	Producer producer;
 	
 	public Consumer(Producer producer) {
 		this.producer=producer;
 	}
 	
 	@Override
 	public void run() {
 		
 		synchronized(producer.sb) {
 		try {
 			producer.sb.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		System.out.println(producer.sb);
 		}
 	}

 }

 public class betterCommunication {
 public static void main(String[] args) {
 	Producer obj1 =new Producer();
 	Consumer obj2 = new Consumer(obj1);
 	
 	Thread t1 = new Thread(obj1);//producer Thread
 	Thread t2 = new Thread(obj2);//Consumer Thread 
 	
 	t2.start();//consumer should wait
 	t1.start();//producer should start
 }
 }

 
