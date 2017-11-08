import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo implements ItemListener {
	private Frame f;
	public CheckboxDemo () {
		f = new Frame("Checkbox Example");
		Checkbox one = new Checkbox("One", true);
		Checkbox two = new Checkbox("Two", false);
		Checkbox three = new Checkbox("Three", false);
		one.addItemListener(this);
		two.addItemListener(this);
		three.addItemListener(this);
		f.setLayout(new FlowLayout());
		f.add(one);
		f.add(two);
		f.add(three);
		f.pack();
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		String state = "deselected";
		if (e.getStateChange() == ItemEvent.SELECTED) {
			state = "selected";
		}
		System.out.println(e.getItem() + " " + state);
	}
	public static void main(String args[]) {
		CheckboxDemo bd = new CheckboxDemo();
	}
}
