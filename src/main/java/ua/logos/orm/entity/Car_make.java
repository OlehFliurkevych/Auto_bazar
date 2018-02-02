package ua.logos.orm.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_make")
public class Car_make extends BaseEntity{

	@Column(name="make_title")
	private String make_title;
	
	@Column(name="manufacture_year",columnDefinition="Decimal(4,0)")//max=9999.0
	private BigDecimal manufacture_year;
	
	@OneToOne(mappedBy="carMake")
	private Car car;
	
	
	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	Car_make(){
		
	}
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="car_model_id")
	private Car_model carModel;
	
	
	
	public Car_make(String make_title, BigDecimal manufacture_year) {
		this.make_title = make_title;
		this.manufacture_year = manufacture_year;
	}


	public Car_model getCarModel() {
		return carModel;
	}

	
	public BigDecimal getManufacture_year() {
		return manufacture_year;
	}


	public void setManufacture_year(BigDecimal manufacture_year) {
		this.manufacture_year = manufacture_year;
	}


	public void setCarModel(Car_model carModel) {
		this.carModel = carModel;
	}


	public String getMake_title() {
		return make_title;
	}
	public void setMake_title(String make_title) {
		this.make_title = make_title;
	}


	@Override
	public String toString() {
		return "Car_make [make_title=" + make_title + ", manufacture_year=" + manufacture_year + ", carModel="
				+carModel+ "]";
	}
	
	
	
}
