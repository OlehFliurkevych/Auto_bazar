package ua.logos.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_seller")
public class Car_seller extends BaseEntity {
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="phone_number")
	private int phone_number;
	
	Car_seller(){
		
	}
	
	@OneToOne(mappedBy="carSeller")
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Car_seller(String first_name, String last_name, int age, int phone_number) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.phone_number = phone_number;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "Car_seller [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", phone_number="
				+ phone_number + "]";
	}
	

}
