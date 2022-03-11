package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getProddate() {
		return proddate;
	}
	public void setProddate(String proddate) {
		this.proddate = proddate;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMfgcountry() {
		return mfgcountry;
	}
	public void setMfgcountry(String mfgcountry) {
		this.mfgcountry = mfgcountry;
	}
	public String getMgfcity() {
		return mgfcity;
	}
	public void setMgfcity(String mgfcity) {
		this.mgfcity = mgfcity;
	}
	public String getSellcity() {
		return sellcity;
	}
	public void setSellcity(String sellcity) {
		this.sellcity = sellcity;
	}
	public String getSellcountry() {
		return sellcountry;
	}
	public void setSellcountry(String sellcountry) {
		this.sellcountry = sellcountry;
	}
	public String getNoofprod() {
		return noofprod;
	}
	public void setNoofprod(String noofprod) {
		this.noofprod = noofprod;
	}
	public String getLaunchdate() {
		return launchdate;
	}
	public void setLaunchdate(String launchdate) {
		this.launchdate = launchdate;
	}
	private int id;
	  private String name;
	  private String  mfgdate;
	  private String expdate;
	  private String proddate;
	  private String prodprice;
	  private String modelno;
	  private String color;
	  private String type;
	  private String mfgcountry;
	  private String mgfcity;
	  private String sellcity;
	  private String sellcountry;
	  private String noofprod;
	  private String launchdate;

}
