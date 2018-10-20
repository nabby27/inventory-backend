package com.project.inventory.models;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_PRODUCTS")
@Access(AccessType.FIELD)
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "price", nullable = false)
	private int price;
	
	@Column(name = "brand", nullable = false)
	private String brand;
	
	@Column(name = "cod", nullable = false)
	private String cod;
	
    @ManyToOne
    @JoinColumn(name = "dealer_id")
	private Dealer dealer;
    
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Set<ChangeLog> changeLog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Dealer getProvider() {
		return dealer;
	}

	public void setProvider(Dealer provider) {
		this.dealer = provider;
	}

	public Set<ChangeLog> getChangeLog() {
		return changeLog;
	}

	public void setChangeLog(Set<ChangeLog> changeLog) {
		this.changeLog = changeLog;
	}
	
}
