package one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double price;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Charger charger;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger c) {
		this.charger = c;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", price=" + price + ", c=" + charger+ "]";
	}
	
	
}
