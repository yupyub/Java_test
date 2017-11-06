import java.awt.*;
public class TestButton {
	public static void main(String args[]) {
		Frame f = new Frame("Test");
		Button b = new Button("Press Me");
		b.addActionListener(new ButtonHandler());
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}
