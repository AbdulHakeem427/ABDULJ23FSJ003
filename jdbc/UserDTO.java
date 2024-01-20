package jdbc;

public class UserDTO {//DTO - Data Transfer Object	
	private int uid;
	private String uname,upass;
	private int salary,flag;
	public UserDTO() {
			// TODO Auto-generated constructor stub
	}
	public UserDTO(int uid, String uname, String upass, int salary, int flag) {		
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.salary = salary;
		this.flag = flag;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the upass
	 */
	public String getUpass() {
		return upass;
	}
	/**
	 * @param upass the upass to set
	 */
	public void setUpass(String upass) {
		this.upass = upass;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", salary=" + salary + ", flag=" + flag
				+ "]";
	}			
}
	
