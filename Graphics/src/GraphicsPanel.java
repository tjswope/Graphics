// Graphics Panel
// Written by: Mr. Swope
// Date: February 10th, 2015
// This project extends the Jpanel class. In order to draw items on this panel you need use the Graphics2D's methods.
// Update these comments by writing when, who and how you modified this class.

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{

	// method: GraphicsPanel Constructor
	// description: This 'method' runs when a new instance of this class in instantiated.  It sets default values  
	// that are necessary to run this project.  You do not need to edit this method.
	public GraphicsPanel(){
		setPreferredSize(new Dimension(500, 500));
	}

	// method: paintComponent
	// description: This method is called when the Panel is painted.  It contains code that draws shapes onto the panel.
	// parameters: Graphics g - this object is used to draw shapes onto the JPanel.
	// return: void
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(255, 10, 100));
		g2.fillRect(20, 100, 200, 500);
		g2.setColor(Color.PINK);
//		g2.fillRect(0, 0, 500, 500);
//		g2.setColor(Color.BLUE);
//		g2.fillRect(250, 250, 100, 100);  //This is an example of how you can draw a rectangle onto the panel.
//		g2.setColor(Color.GRAY);
		g2.fillOval(10, 10, 50, 50);
//		g2.setColor(Color.MAGENTA);
//		g2.fillRect(6, 8, 10, 20);
		g2.setColor(new Color(0, 0, 0));
		g2.setFont(new Font("Arial", 3, 200));
		g2.drawString("Bob!", 40, 280);
//		g2.drawRect(70, 70, 100, 300);
		g2.fillPolygon(new int[]{15, 36, 7}, new int[]{5, 96, 75}, 3);
	}
}
