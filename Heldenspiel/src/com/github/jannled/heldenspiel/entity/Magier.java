package com.github.jannled.heldenspiel.entity;

import com.github.jannled.heldenspiel.item.Stab;

public class Magier extends Held 
{
	public Magier(String name, int lebenspunkte, Stab stab) 
	{
		super(name, lebenspunkte, 1);
		this.waffe = stab;
	}
	
	public void heilen(int leben)
	{
		lebenspunkte = lebenspunkte+leben;
	}
}
