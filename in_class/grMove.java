import java.awt.*;
public class grMove extends Frame{
	Image haema = Toolkit.getDefaultToolkit().getImage("C:/Users/정성엽/Documents/Github/Java_test/in_class/haema.GIF");
	public grMove(String str){
		super(str);
		setBackground(Color.white);
	}
	public void paint(Graphics g){
		Dimension d  = getSize();
		Insets    in = getInsets();
		int cpok = d.width - in.left - in.right;      // width, height
		int cnpi = d.height - in.top - in.bottom;
		int x,y,l, R,G,B, i;
		for (i=0 ; i<500 ; i++) {
			 x = (int)(Math.random()*cpok);
			 y = (int)(Math.random()*cnpi);
			 l = (int)(Math.random()*10);
			 R = (int)(Math.random()*255);
			 G = (int)(Math.random()*255);
			 B = (int)(Math.random()*255);
			 g.setColor( new Color(R, G, B) );
			 g.fillOval(x,y, l,l);
		}
		x = 10;
		g.setXORMode(Color.white);
		for (i=0 ; x+100<cpok-20 ; i++){
			 g.drawImage(haema, x,30, 100, 200, this); // draw haema
			 for (int j=0 ; j<300000 ; j++) // wait for a short time
			 ;
			 g.drawImage(haema, x,30, 100, 200, this); // delete haeme drawed
			 x += 10;
		 }
		 g.drawImage(haema, x,30, 100, 200, this);
	}
	public static void main(String[] args){
		Frame frm = new grMove("MoveImage");
		frm.setSize(5000,300);
		WindowDestroyer listener = new WindowDestroyer();
		frm.addWindowListener(listener);
		frm.setVisible(true);
	}
}
