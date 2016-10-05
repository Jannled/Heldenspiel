package com.github.jannled.heldenspiel;

import entity.Held;
import entity.Monster;

public class Kampfregel 
{
	Wuerfel wuerfel = new Wuerfel(6);
	private Monster monster;
	private Held held;
	
	public Kampfregel(Held held, Monster monster)
	{
		this.held = held;
		this.monster = monster;
	}
	
	public void kampf()
	{
		if(getHeld().getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Der Held hat verloren!");
			return;
		}
		
		if(getMonster().getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Das Monster hat verloren!");
			return;
		}
		
		getHeld().setAngrifswert(wuerfel.wuerfeln());
		getMonster().setAngrifswert(wuerfel.wuerfeln());
		if(getHeld().getAngrifswert() > getMonster().getAngrifswert())
		{
			getMonster().setLebenspunkte(getMonster().getLebenspunkte()-1);
		}
		else
		{
			getHeld().erhalteSchaden(1);
		}
		if(getHeld().getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Der Held hat verloren!");
			return;
		}
		
		if(getMonster().getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Das Monster hat verloren!");
			return;
		}
	}

	public Held getHeld() {
		return held;
	}

	public void setHeld(Held held) {
		this.held = held;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}
}
