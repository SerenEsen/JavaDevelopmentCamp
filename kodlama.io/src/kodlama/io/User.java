package kodlama.io;

public class User {
	private String firstName;
	private String lastName;
	private int userId;
	private String eMail;
	private String password;
	String course;
	public User() {
		
	}
	
	public User(String firstName,String lastName,int userId,String eMail,String password) {
		this();
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		this.eMail=eMail;
		this.userId=userId;
		this.course=course;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
