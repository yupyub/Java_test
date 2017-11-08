import java.awt.*;
import java.awt.event.*;
public class CanvasMouseDemo extends Canvas implements MouseListener {
	private int index;
	Color colors[] = {Color.red, Color.green, Color.blue};
	public CanvasMouseDemo () {
		super();
	}
	public void paint(Graphics g) {
		g.setColor(colors[index]);
		g.fillRect(0, 0, getSize().width, getSize().height);
	}
	public void mouseClicked(MouseEvent e){
		index++;
		if (index == colors.length)
			index = 0;
		repaint();
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}
	//public void mouseMoved(MouseEvent e) {}	??
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public static void main(String args[]) {
		Frame f = new Frame("Canvas Example");
		CanvasMouseDemo can = new CanvasMouseDemo();
		can.setSize(150,150);
		f.add(can, BorderLayout.CENTER);
		can.requestFocus();
		can.requestFocus();
		can.addMouseListener(can);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
}
