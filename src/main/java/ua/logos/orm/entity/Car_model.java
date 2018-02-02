package ua.logos.orm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_model")
public class Car_model extends BaseEntity{

	@Column(name="model_title")
	private String model_title;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="car_color_id")
	private Car_color carColor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="engine_capacity_id")
	private Car_engine_capacity engineCapacity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fuel_type_id")
	private Car_fuel_type fuel_type;
	
	
	public Car_color getCarColor() {
		return carColor;
	}

	public void setCarColor(Car_color carColor) {
		this.carColor = carColor;
	}

	public Car_engine_capacity getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Car_engine_capacity engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Car_fuel_type getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(Car_fuel_type fuel_type) {
		this.fuel_type = fuel_type;
	}
	
	@OneToOne(mappedBy="carModel",cascade=CascadeType.ALL)
	private Car_make carMake;
	
	public Car_make getCarMake() {
		return carMake;
	}

	public void setCarMake(Car_make carMake) {
		this.carMake = carMake;
	}

	Car_model(){
		
	}

	@Override
	public String toString() {
		return "Car_model [model_title=" + model_title + ", carColor=" + carColor + ", engineCapacity=" + engineCapacity
				+ ", fuel_type=" + fuel_type + ", carMake="  +carMake+ "]";
	}

	

	public Car_model(String model_title) {
		this.model_title = model_title;
	}

	public String getModel_title() {
		return model_title;
	}
	public void setModel_title(String model_title) {
		this.model_title = model_title;
	}

}
