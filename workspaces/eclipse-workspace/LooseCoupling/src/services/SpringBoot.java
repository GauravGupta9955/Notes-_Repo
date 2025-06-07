package services;

public class SpringBoot implements ICourse{

	@Override
	public Boolean getTheCourse(Double price) {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot is purchased and feed is paid"+ price);
		return true;
	}

}
