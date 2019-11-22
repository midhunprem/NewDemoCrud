package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_school_seq")
	@SequenceGenerator(sequenceName = "newproject_sequence",allocationSize = 1,name = "tbl_school_seq")
	private int id;
	private String name;
	private String district;
	private int strength;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
	
}
