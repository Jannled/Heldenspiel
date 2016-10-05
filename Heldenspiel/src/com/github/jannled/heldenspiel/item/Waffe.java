package com.github.jannled.heldenspiel.item;

public abstract class Waffe 
{
	int schaden;
	
	public Waffe(int schaden)
	{
		this.schaden = schaden;
	}
	
	public int getSchaden()
	{
		return schaden;
	}
}
