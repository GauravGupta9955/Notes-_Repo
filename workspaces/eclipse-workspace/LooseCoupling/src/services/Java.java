package services;

public class Java implements ICourse
{
    
	@Override
	public Boolean getTheCourse(Double price) {
		// TODO Auto-generated method stub
		System.out.println("Java Course is purchased and feed is paid"+ price);
		return true;
	}

}
