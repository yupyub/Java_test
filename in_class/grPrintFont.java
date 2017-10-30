//javac grPrintFont.java -encoding UTF8
import java.awt.*;
public class grPrintFont extends Frame{
	public grPrintFont(String str){
		super(str);
	}
	public void paint(Graphics g){
		setBackground(Color.green);
		g.drawString("문자열 출력",10,40);
		Font fnt = new Font("바탕체",Font.BOLD,30);
		g.setFont(fnt);
		g.drawString("자바를 잡아라!",10,70);
		g.setFont(new Font("바탕체",Font.BOLD + Font.ITALIC,50));
		String str = "JAVA java 자바";
		g.drawString(str,10,140);
	}
	public static void main(String[] args){
		Frame frm = new grPrintFont("String");
		frm.setSize(500,300);
		WindowDestroyer listner = new WindowDestroyer();
		frm.addWindowListener(listner);
		frm.setVisible(true);
	}
}
