import java.applet.*;
import java.awt.Graphics;
import java.awt.Font;
public class DrawFace  extends Applet{
public void paint(Graphics g){
	Font f=new Font("Hello",Font.BOLD+Font.ITALIC,40);
	g.setFont(f);
	g.drawString("Vibhor", 50, 40);
   g.drawOval(60, 60, 200, 200);
   g.fillOval(90, 120, 60, 20);
   g.fillOval(190, 120, 60, 20);
   g.drawLine(165, 125, 165, 175);
   g.drawArc(110, 130, 95, 95, 0, -180);
   
    	
}
}
