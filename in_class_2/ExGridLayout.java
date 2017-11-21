import java.awt.*;
public class ExGridLayout extends Frame {
	public ExGridLayout (String str) {
		super(str);
	}
	public static void main(String args[]) {
		ExGridLayout f = new ExGridLayout("Simple GridLayout Example");
		f.setLayout(new GridLayout(3,2,200,300));
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		Button b4 = new Button("B4");
		Button b5 = new Button("B5");
		Button b6 = new Button("B6");
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		f.add(b5); f.add(b6);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
}
