import java.awt.*;
public class grLineRect extends Frame{
	public grLineRect(String str){
		super(str);
	}
	public void paint(Graphics g){
		setBackground(Color.yellow);
		g.setColor(Color.red);
		g.drawLine(10,30,400,30);
		g.drawRect(10,50,80,200);
		g.setColor(new Color(255,255,255));
		g.fillRect(110,50,80,200);
		g.drawRoundRect(200,50,80,200,10,30);
		g.fillRoundRect(300,50,80,200,30,10);
	}
	public static void main(String[] args){
		Frame frm = new grLineRect("Line/Rect");
		frm.setSize(500,300);
		WindowDestroyer listner = new WindowDestroyer();
		frm.addWindowListener(listner);
		frm.setVisible(true);
	}
}
