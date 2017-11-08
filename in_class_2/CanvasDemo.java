import java.awt.*;
import java.awt.event.*;
public class CanvasDemo extends Canvas implements KeyListener {
	private int index;
	Color colors[] = {Color.red, Color.green, Color.blue};
	public CanvasDemo () {
		super();
	}
	public void paint(Graphics g) {
		g.setColor(colors[index]);
		g.fillRect(0, 0, getSize().width, getSize().height);
	}
	public void keyTyped(KeyEvent e) {
		index++;
		if (index == colors.length)
			index = 0;
		repaint();
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e){}
	public static void main(String args[]) {
		Frame f = new Frame("Canvas Example");
		CanvasDemo can = new CanvasDemo();
		can.setSize(150,150);
		f.add(can, BorderLayout.CENTER);
		can.requestFocus();
		can.requestFocus();
		can.addKeyListener(can);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
}
