package in.ineuron.bean;

public class Student {
	
	private Integer id;
	private String name;
	private String address;
	private Integer age;
	
	static {
		System.out.println(".class file is loading");
	}
	
	public Student() {
		System.out.println("Student object is created");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Student.getId()");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Student.getName()");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Student.getAddress()");
		this.address = address;
	}
	

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		System.out.println("Student.getAge()");
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	 

}
