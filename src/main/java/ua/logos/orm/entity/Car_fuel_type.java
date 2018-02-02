package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car_fuel_type")
public class Car_fuel_type extends BaseEntity {

	@Column(name="fuel_type")
	private String fuel_type;
	Car_fuel_type(){
		
	}
	@OneToMany(mappedBy="fuel_type")
	private List<Car_model> carModels;
	
	public List<Car_model> getCarModels() {
		return carModels;
	}
	public void setCarModels(List<Car_model> carModels) {
		this.carModels = carModels;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		return "Car_fuel_type [fuel_type=" + fuel_type + "]";
	}
	public Car_fuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	
}
