import java.awt.*;
public class grImage extends Frame{
	Image img = Toolkit.getDefaultToolkit().getImage("C:/Users/정성엽/Documents/Github/Java_test/in_class/haema.GIF");
	public grImage(String str){
		super(str);
		img = Toolkit.getDefaultToolkit().getImage("C:/Users/정성엽/Documents/Github/Java_test/in_class/haema.GIF");
	}
	public void paint(Graphics g){
		g.drawImage(img,10,30,this);
		g.drawImage(img,100,100,400,150,this);
		g.drawRect(100,100,400,150);
	}
	public static void main(String[] args){
		Frame frm = new grImage("Image Processing");
		frm.setSize(500,300);
		WindowDestroyer listener = new WindowDestroyer();
		frm.addWindowListener(listener);
		frm.setVisible(true);
	}
}
