import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo {
	private Frame f;
	private TextField tf;
	public TextFieldDemo () {
		f = new Frame("TextField");
		tf = new TextField("Single Line", 30);
		tf.addKeyListener(new NameHandler());
		f.add(tf, BorderLayout.CENTER);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}

	class NameHandler extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char c = e.getKeyChar();
			if (Character.isDigit(c))
			 e.consume();
		 }
	 }
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e){}
	public static void main(String args[]) {
		TextFieldDemo tfd = new TextFieldDemo();
	}
}
