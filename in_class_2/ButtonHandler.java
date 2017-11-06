import java.awt.event.*;
public class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Action Occurred");
		System.out.println("Button's label is "
		+ e.getActionCommand());
	}
}
