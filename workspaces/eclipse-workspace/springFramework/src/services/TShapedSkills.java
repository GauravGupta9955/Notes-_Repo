package services;

public class TShapedSkills {
	private ICourse course;
	
	public void setCourse(ICourse course) {
		this.course = course;
	}
 public boolean buyTheCourse(Double amount) {
	 return course.getTheCourse(amount);
 }




}
