package ncs.test6;

import java.util.Objects;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	//
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone)
				&& Objects.equals(name, this.name);
	}

	@Override
	public Object clone() {
		return new User(this.id, this.password, this.name, this.age, this.gender, this.phone);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", phone=" + phone + "]";
	}
	
	

}
