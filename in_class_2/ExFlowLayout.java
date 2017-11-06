import java.awt.*;
public class ExFlowLayout extends Frame {
	public ExFlowLayout (String str) {
		super(str);
	}
	public static void main(String args[]) {
		ExFlowLayout f = new ExFlowLayout("Simple FlowLayout Example");
		f.setLayout(new FlowLayout());
		Button b1 = new Button("Press Me");
		Button b2 = new Button("Don't Press Me");
		f.add(b1);
		f.add(b2);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();  // window destroy button
		f.addWindowListener(listener);
		f.setVisible(true);
	} 
}
