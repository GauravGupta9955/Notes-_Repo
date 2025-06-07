package Onetomany;

public class Employees {
	private Integer eid;
	private String ename;
	public Employees(Integer eid, String ename) {
		this.setEid(eid);
		this.setEname(ename);
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
	

}
