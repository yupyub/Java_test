import java.awt.*;
public class pa2_20161641 extends Frame{
	Image haema = Toolkit.getDefaultToolkit().getImage("./haema.GIF");
	public pa2_20161641(String str){
		super(str);
		setBackground(Color.white);
	}
	public void paint(Graphics g){
		Dimension d  = getSize();
		Insets in = getInsets();
		int cpok = d.width - in.left - in.right;      // width, height
		int cnpi = d.height - in.top - in.bottom;
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		int x,y,l, R,G,B, i,j,k;
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
		x = 30;
		y = 50;
		g.setXORMode(Color.white);
		for(i = 0;i<4;i++){
			while(true){
				if(x + 100 + dx[i]*10>cpok-30)
					break;
				else if(x+dx[i]*10 < 30)
					break;
				else if(y + 200 + dy[i]*10>cnpi-30)
					break;
				else if(y+dy[i]*10 < 50)
					break;
				g.drawImage(haema, x,y, 100, 200, this); // draw haema
				for (k=0 ; k<30000 ; k++)// wait for a short time
   			 	;
				g.drawImage(haema, x,y, 100, 200, this); // delete haeme drawed
				x += dx[i] * 10;
				y += dy[i] * 10;
			}
		}
		g.drawImage(haema, x,y, 100, 200, this);
	}
	public static void main(String[] args){
		Frame frm = new pa2_20161641("MoveImage");
		frm.setSize(2000,1500);
		WindowDestroyer listener = new WindowDestroyer();
		frm.addWindowListener(listener);
		frm.setVisible(true);
	}
}
