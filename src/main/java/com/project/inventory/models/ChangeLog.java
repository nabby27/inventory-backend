package com.project.inventory.models;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_CHANGE_LOG")
@Access(AccessType.FIELD)
public class ChangeLog extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "old_quantity", nullable = false)
	private int oldQuantity;
	
	@Column(name = "olnewd_quantity", nullable = false)
	private int newQuantity;
	
	@Column(name = "change_date", nullable = false)
	private Date changeDate;

	@ManyToOne
    @JoinColumn(name = "product_id")
	private Product product;

	public int getOldQuantity() {
		return oldQuantity;
	}

	public void setOldQuantity(int oldQuantity) {
		this.oldQuantity = oldQuantity;
	}

	public int getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(int newQuantity) {
		this.newQuantity = newQuantity;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
