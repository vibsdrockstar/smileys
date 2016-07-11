import java.applet.Applet;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
public class smiley extends Applet{
public void init(){
this.resize(900,800);
}
public void paint(Graphics g){
	setBackground(Color.cyan);
	g.setColor(Color.yellow);
	g.fillOval(50, 50, 75, 75);
	g.setColor(Color.black);
	g.fillOval(65, 65, 15, 15);
	g.fillOval(95, 65, 15, 15);
	g.drawOval(90, 63, 25, 25);
	g.drawOval(60, 63, 25, 25);
	g.drawArc(70, 90, 40, 15, 180, 180);
	}
	}



