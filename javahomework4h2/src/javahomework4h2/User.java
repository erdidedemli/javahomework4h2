package javahomework4h2;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String BirthofYear;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String birthofYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		BirthofYear = birthofYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getBirthofYear() {
		return BirthofYear;
	}

	public void setBirthofYear(String birthofYear) {
		BirthofYear = birthofYear;
	}

}
