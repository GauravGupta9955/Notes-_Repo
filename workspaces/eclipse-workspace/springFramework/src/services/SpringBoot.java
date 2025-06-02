package services;

public class SpringBoot implements ICourse {

	@Override
	public Boolean getTheCourse(Double Price) {
		System.out.println("Spring Boot course is purchased and fees is paid");

		return true;
	}

}
