
public class Accounts {
	private long id;
	private String fullName;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String createAt;

	
	
	public Accounts(long id, String fullName, String username, String password, String email, String phone, String createAt) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.createAt = createAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Accounts() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}



	@Override
	public String toString() {
		return "Accounts [id=" + id + ", fullName=" + fullName + ", username=" + username 
				+ ", email=" + email + ", phone=" + phone + ", createAt=" + createAt + "]";
	}
	
	
	
}
