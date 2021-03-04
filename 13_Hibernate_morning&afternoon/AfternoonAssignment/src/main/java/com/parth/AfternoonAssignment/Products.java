package com.parth.AfternoonAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Products {
	@Id
	private int proid;
	private String proname;
	
	@OneToMany(mappedBy="pro")
	List<Category> cats= new ArrayList();
	
	@ManyToMany(mappedBy="products")
	List<Supplier> sups=new ArrayList();

	public List<Category> getCats() {
		return cats;
	}

	public void setCats(List<Category> cats) {
		this.cats = cats;
	}

	public List<Supplier> getSups() {
		return sups;
	}

	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}

	public int getPid() {
		return proid;
	}

	public void setPid(int proid) {
		this.proid = proid;
	}

	public String getPname() {
		return proname;
	}

	public void setPname(String proname) {
		this.proname = proname;
	}


	@Override
	public String toString() {
		return "Product [proid=" + proid + ", proname=" + proname + ", cats=" + cats + ", sups=" + sups + "]";
	}
	

}
