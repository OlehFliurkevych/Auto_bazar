package ua.logos.orm.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car extends BaseEntity{
	
	@Column(name="sell_price",columnDefinition="Decimal(5,2)")
	private BigDecimal sell_price;
	
	@OneToOne
	@JoinColumn(name="car_make_id")
	private Car_make carMake;
	
	@OneToOne
	@JoinColumn(name="car_seller_id")
	private Car_seller carSeller;
	
	public Car_make getCarMake() {
		return carMake;
	}
	public void setCarMake(Car_make carMake) {
		this.carMake = carMake;
	}
	public Car_seller getCarSeller() {
		return carSeller;
	}
	public void setCarSeller(Car_seller carSeller) {
		this.carSeller = carSeller;
	}
	Car(){
		
	}

	

	public Car(BigDecimal sell_price, Car_make carMake, Car_seller carSeller) {
		this.sell_price = sell_price;
		this.carMake = carMake;
		this.carSeller = carSeller;
	}

	
	@Override
	public String toString() {
		return "Car [sell_price=" + sell_price + ", carMake=" + carMake + ", carSeller=" + carSeller + "]";
	}
	public BigDecimal getSell_price() {
		return sell_price;
	}
	public void setSell_price(BigDecimal sell_price) {
		this.sell_price = sell_price;
	}

	
}
