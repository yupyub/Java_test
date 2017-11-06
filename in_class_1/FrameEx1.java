import java.awt.*;
import java.awt.event.*;
public class FrameEx1 extends Frame{
	public FrameEx1(String str){
		super(str);
	}
	public void paint(Graphics g){
		for(int i = 0;i<30;i++)
			g.drawRect(10+i*20,10+i*20,450-i*40,250-i*40);
	}
	public static void main(String[] args){
		FrameEx1 frm = new FrameEx1("example of Graphic program");
		frm.setSize(500,300);
		WindowDestroyer listener = new WindowDestroyer();
		frm.addWindowListener(listener);
		frm.setVisible(true);
	}
}
