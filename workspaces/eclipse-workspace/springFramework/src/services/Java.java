package services;

public class Java implements ICourse {

	@Override
	public Boolean getTheCourse(Double Price) {
		System.out.println("Java course is purchased and fees is paid");
		return true;
	}

}
