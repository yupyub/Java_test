import java.awt.*;
import java.awt.event.*;
public class CheckboxGroupDemo implements ItemListener {
	private Frame f;
	public CheckboxGroupDemo () {
		f = new Frame("CheckboxGroup Example");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox one = new Checkbox("One", cbg, true);
		Checkbox two = new Checkbox("Two", cbg, false);
		Checkbox three = new Checkbox("Three", cbg, false);
		one.addItemListener(this);
		two.addItemListener(this);
		three.addItemListener(this);
		f.setLayout(new FlowLayout());
		f.add(one); f.add(two); f.add(three); f.pack();
		WindowDestroyer listener = new WindowDestroyer();  // window destroyer button
		f.addWindowListener(listener);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED)
			System.out.println(e.getItem() + " Selected");
	}
	public static void main(String args[]) {
		CheckboxGroupDemo bd = new CheckboxGroupDemo();
	}
}
