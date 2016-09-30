package com.github.jannled.heldenspiel;

public class Held {
	String name;
	Waffe waffe;
	int angrifswert;
	int lebenspunkte;
	
	public Held(String name, int lebenspunkte)
	{
		this.name=name;
		this.lebenspunkte=lebenspunkte;
		
	}

	public int getAngrifswert() 
	{
		return angrifswert+waffe.getSchaden();
	}

	public void setAngrifswert(int angrifswert) 
	{
		this.angrifswert = angrifswert;
	}

	public int getLebenspunkte() 
	{
		return lebenspunkte;
	}

	public void setLebenspunkte(int lebenspunkte) 
	{
		this.lebenspunkte = lebenspunkte;
	}
	
	public void setWaffe(Waffe waffe)
	{
		this.waffe = waffe;
	}
}

