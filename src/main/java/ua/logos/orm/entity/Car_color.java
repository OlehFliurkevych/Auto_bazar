package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car_color")
public class Car_color extends BaseEntity{

	@Column(name="color")
	private String color;
	
	@OneToMany(mappedBy="carColor")
	private List<Car_model> carModels;

	public List<Car_model> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<Car_model> carModels) {
		this.carModels = carModels;
	}

	Car_color(){
		
	}

	public Car_color(String color) {
		this.color = color;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car_color [color=" + color + "]";
	}
	
}
