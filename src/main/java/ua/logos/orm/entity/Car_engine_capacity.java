package ua.logos.orm.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="car_engine_capacity")
public class Car_engine_capacity extends BaseEntity {
	
	@OneToMany(mappedBy="engineCapacity")
	private List<Car_model> carModels;
	
	public Car_engine_capacity(){
		
	}

	public List<Car_model> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<Car_model> carModels) {
		this.carModels = carModels;
	}

	@Column(name="engine_capacity",columnDefinition="Decimal(2,1)")//max-9.9
	private BigDecimal engine_capacity;

	public BigDecimal getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(BigDecimal engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	@Override
	public String toString() {
		return "Car_engine_capacity [engine_capacity=" + engine_capacity + "]";
	}

	public Car_engine_capacity(BigDecimal engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	
}
