package sqlquery

class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password=" + password + ", username=" + username
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	public User(Integer id, String loginname, String password, String username, String phone, String address) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.username = username;
		this.phone = phone;
		this.address = address;
	}
	Integer id;
	String loginname;
	String password;
	String username;
	String phone;
	String address;
}
