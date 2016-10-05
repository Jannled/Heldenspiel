package com.github.jannled.heldenspiel.entity;

import java.awt.image.BufferedImage;

import com.github.jannled.heldenspiel.item.Waffe;

public abstract class Held {
	String name;
	Waffe waffe;
	int angrifswert;
	int lebenspunkte;
	
	BufferedImage image;
	
	public Held(BufferedImage image, String name, int lebenspunkte, int angriffswert)
	{
		this.name=name;
		this.lebenspunkte = lebenspunkte;
	}

	public int getAngrifswert() 
	{
		if(waffe!=null)
			return angrifswert+waffe.getSchaden();
		return angrifswert;
	}

	public void setAngrifswert(int angrifswert) 
	{
		this.angrifswert = angrifswert;
	}

	public int getLebenspunkte() 
	{
		return lebenspunkte;
	}

	public void erhalteSchaden(int schaden) 
	{
		lebenspunkte = lebenspunkte-schaden;
	}
	
	public Waffe getWaffe()
	{
		return waffe;
	}
	
	public void setWaffe(Waffe waffe)
	{
		this.waffe = waffe;
	}
}

