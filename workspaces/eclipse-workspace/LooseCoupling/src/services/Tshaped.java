package services;

public class Tshaped 
{
	private ICourse course;
	
	public void setCourse(ICourse course) {
		this.course = course;
	} 
  public Boolean buyTheCourse(Double amount) {
	  return course.getTheCourse(amount);
  }

	
	
}
