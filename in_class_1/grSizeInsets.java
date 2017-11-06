import java.awt.*;
public class grSizeInsets extends Frame{
	public grSizeInsets(String str){
		super(str);
	}
	public void paint(Graphics g){
		setBackground(Color.white);
		Dimension d  = getSize();
		Insets in = getInsets(); // width, height of client domain in frame
		int cpok = d.width - in.left - in.right;
		int cnpi = d.height - in.top - in.bottom;
		Image img = Toolkit.getDefaultToolkit().getImage( "C:/Users/정성엽/Documents/Github/Java_test/in_class/haema.GIF");
		g.drawImage(img, 30+30,30+30, cpok,cnpi, this);
		g.drawString("d.width  : " + d.width, 30+10,30+40);
		g.drawString("d.height : " + d.height,30+10,30+60);
		g.drawString("in.left  : " + in.left,30+10,30+80);
		g.drawString("in.right : " + in.right,30+10,30+100);
		g.drawString("in.top   : " + in.top,30+10,30+120);
		g.drawString("in.bottom: " + in.bottom, 30+10,30+140);
	}
	public static void main(String[] args){
		Frame frm = new grSizeInsets("FrameSizeInfo");
		frm.setSize(500,300);
		WindowDestroyer listener = new WindowDestroyer();
		frm.addWindowListener(listener);
		frm.setVisible(true);
	}
}
