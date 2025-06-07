
public class Date1 {
	public static void main(String[] args) {
		java.util.Date utilDate =new java.util.Date();
		System.out.println(utilDate);//Thu Aug 01 15:36:36 IST 2024
		
		long hour =utilDate.getHours();
        System.out.println(hour);
        
        java.sql.Date sqlDate=new java.sql.Date(hour);
		System.out.println(sqlDate);//1970-01-01
        
        long time =utilDate.getTime();
        System.out.println(time);
        
  
        java.sql.Date sql1Date=new java.sql.Date(time);
		System.out.println(sql1Date);//2024-08-01
		
		

	}

}
