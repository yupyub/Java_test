import java.awt.*;
import java.applet.*;       // Applet class
public class apYeJe extends Applet    {
	public void init() // this method is executed firstly.
	{
		setBackground(Color.red);
	}
	public void paint(Graphics g)      {
		g.setFont(new Font("바탕체", Font.BOLD, 30));
		g.drawString( "자바 애플릿 JAVA Applet", 10,100);
	}
}
