
public class Account {
		
		//instance Variable
		private String accNo;
		private String accType;
		private String accName;
	
		
		public Account(String accNo,String accType,String accName){
			System.out.println("Account::constructor");
			this.accNo=accNo;
			this.accType=accType;
			this.accName=accName;
		}


		public String getAccNo() {
			return accNo;
		}


		public String getAccType() {
			return accType;
		}


		public String getAccName() {
			return accName;
		}


}
