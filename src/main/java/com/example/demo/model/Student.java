package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentInfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "Student_Name")
	private String student_name;

	@Column(name = "Father_Name")
	private String father_name;
	
	@Column(name = "DOB")
	private int dob;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "Pin")
	private int pin;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Class_opted")
	private String class_opt;
	
	@Column(name = "Marks")
	private float marks;
	
	@Column(name = "Date_enroll")
	private String date;
	
	public Student() {
		
	}

	public Student(String id, String student_name, String father_name, int dob, String address, String city, String state,
			int pin, String phone, String email, String class_opt, float marks, String date) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.father_name = father_name;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.phone = phone;
		this.email = email;
		this.class_opt = class_opt;
		this.marks = marks;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClass_opt() {
		return class_opt;
	}

	public void setClass_opt(String class_opt) {
		this.class_opt = class_opt;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	
}