 package encapsulation;

 class Books{
	 private int pgNo;

	public int getPgNo() {
		return pgNo;
	}

	public void setPgNo(int pgNo) {
		if(pgNo>0)
		this.pgNo = pgNo;
		else
			System.out.println("invalid page number");
	}
	 
 }
public class Encaps1 {
	public static void main(String[] args) {
		Books b =new Books();
		b.setPgNo(100);
		System.out.println(b.getPgNo());
		
	}

}
