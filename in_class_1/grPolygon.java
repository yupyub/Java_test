import java.awt.*;
public class grPolygon extends Frame{
	public grPolygon(String str){
		super(str);
	}
	public void paint(Graphics g){
		int[] x = {30,200,250,400,450,30};
		int[] y = {140,50,70,30,140,140};
		g.drawPolygon(x,y,x.length-1);
		for(int i = 0;i<x.length;i++)
			y[i] += 150;
		g.drawPolygon(x,y,x.length);
		for(int i = 0;i<x.length;i++)
			y[i] += 150;
		g.fillPolygon(x,y,x.length-1);
	}
	public static void main(String[] args){
		Frame frm = new grPolygon("Oval/Arc");
		frm.setSize(500,480);
		WindowDestroyer listner = new WindowDestroyer();
		frm.addWindowListener(listner);
		frm.setVisible(true);
	}
}
