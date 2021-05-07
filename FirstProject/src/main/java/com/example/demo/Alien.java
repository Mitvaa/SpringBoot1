package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")//if you don't want automatic object creation
public class Alien {

	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private laptop lapi;
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("object created..");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public laptop getLapi() {
		return lapi;
	}
	public void setLapi(laptop lapi) {
		this.lapi = lapi;
	}
	
	public void show()
	{
		System.out.println("heyy Mitva");
		lapi.compile();
	}
}
