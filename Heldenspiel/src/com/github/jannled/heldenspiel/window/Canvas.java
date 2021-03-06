package com.github.jannled.heldenspiel.window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.github.jannled.heldenspiel.Kampfregel;

public class Canvas extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	Kampfregel kampfregel;
	public Canvas(Kampfregel kampfregel)
	{
		this.kampfregel = kampfregel;	
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(200, 200);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		int factor = 50/(getWidth()/4);
		//int width = 50*factor;
		
	//Setze Hintergrundfarbe
		g.setColor(new Color(0,0,255));
		g.fillRect(0, 0, 200, 200);
		
	//Setze Held Farbe/Image
		g.setColor(new Color(255, 0, 0));
		g.drawOval(10, 100, 50, 50);
		
	//Setze Held Leben
		g.drawString(""+kampfregel.getHeld().getLebenspunkte(), 60, 100);
		
	//Setze Monster Leben
		g.drawString(""+kampfregel.getMonster().getLebenspunkte(), 140, 100);
		
	//Setze Monster Farbe/Image
		g.setColor(new Color(0, 255, 0));
		g.drawOval(140, 100, 50, 50);
	
		if(kampfregel.getHeld().getLebenspunkte()<=0)
		{
			g.drawString("Der Held hat verloren", 15,15);
		}
		
		if(kampfregel.getMonster().getLebenspunkte()<=0)
		{
			g.drawString("Das Monter hat verloren", 15,15);
		}
	}
	
}
