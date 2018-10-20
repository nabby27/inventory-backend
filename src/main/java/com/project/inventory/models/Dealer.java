package com.project.inventory.models;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_PROVIDERS")
@Access(AccessType.FIELD)
public class Dealer extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL)
	private Set<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
