package com.github.jannled.heldenspiel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;

import com.github.jannled.heldenspiel.window.WindowManager;

import com.github.jannled.heldenspiel.entity.Held;
import com.github.jannled.heldenspiel.entity.Monster;

public class Spiel 
{
	private Kampfregel kampfregel;
	private Held held;
	private Monster monster;
	
	private WindowManager windowManager;
	
	public Spiel(WindowManager windowManager) 
	{
		this.windowManager = windowManager;
		JDialog selectCharacter = new JDialog(windowManager.getWindow(), "Wähle einen Charackter!");
		selectCharacter.setModal(true);
		
		
	}
	public Kampfregel getKampfregel() {
		return kampfregel;
	}
	public void setKampfregel(Kampfregel kampfregel) {
		this.kampfregel = kampfregel;
	}
	

}
