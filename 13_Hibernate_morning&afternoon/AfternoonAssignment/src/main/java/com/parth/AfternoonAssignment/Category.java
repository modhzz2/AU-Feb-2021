package com.parth.AfternoonAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Category {
	@Id
	private int catid;
	private String catname;
	
	@ManyToOne
	Products pro;
	
	@ManyToMany(mappedBy="cats")
	List<Supplier> sups=new ArrayList();
	
	public List<Supplier> getSups() {
		return sups;
	}
	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}
	
	

	public Products getPro() {
		return pro;
	}
	public void setPro(Products pro) {
		this.pro = pro;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", catname=" + catname + ", pro=" + pro + ", sups=" + sups + "]";
	}

}
