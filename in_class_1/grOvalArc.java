import java.awt.*;
public class grOvalArc extends Frame{
	public grOvalArc(String str){
		super(str);
	}
	public void paint(Graphics g){
		g.drawOval(10,30,150,250);
		g.drawArc(200,30,150,250,30,270);
		g.fillArc(400,30,150,250,30,270);
	}
	public static void main(String[] args){
		Frame frm = new grOvalArc("Oval/Arc");
		frm.setSize(600,300);
		WindowDestroyer listner = new WindowDestroyer();
		frm.addWindowListener(listner);
		frm.setVisible(true);
	}
}
