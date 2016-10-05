package com.github.jannled.heldenspiel.window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.github.jannled.heldenspiel.Spiel;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class WindowManager
{
	Spiel spiel = new Spiel();
	Canvas canvas = new Canvas(spiel.getKampfregel());
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowManager window = new WindowManager();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowManager() 
	{
		initialize();
		frame.pack();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnStart = new JButton("Fight");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				spiel.getKampfregel().kampf();
				canvas.repaint();
			}
		});
		panel.add(btnStart);
		
		panel.add(canvas);
	}

	public JFrame getWindow()
	{
		return frame;
	}
}
