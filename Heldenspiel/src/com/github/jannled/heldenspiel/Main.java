package com.github.jannled.heldenspiel;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.jannled.heldenspiel.window.WindowManager;

public class Main 
{
	WindowManager windowManager;
	
	public static BufferedImage krieger;
	public static BufferedImage magier;
	
	private Main()
	{
		windowManager = new WindowManager();
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public void loadImages()
	{
		try 
		{
			krieger = ImageIO.read(Main.class.getResource("/assets/Kämpfer.png"));
			magier = ImageIO.read(Main.class.getResource("/assets/Magier.png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
