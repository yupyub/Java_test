import java.awt.*;
import java.awt.event.*;
public class DialogDemo implements ActionListener {
	private Frame f;
	private Dialog   saekDlg;
	private Button pal, cho, pa, done;
	public DialogDemo() {
		f = new Frame("Dialog Test");
		saekDlg = new Dialog(f, "프레임 바탕색 설정", false); // dialog box saekDlg const.
		pal = new Button("빨강"); saekDlg.add(pal);
		cho = new Button("초록"); saekDlg.add(cho);
		pa  = new Button("파랑"); saekDlg.add(pa);
		done = new Button("확인"); saekDlg.add(done);
		pal.addActionListener(this);
		cho.addActionListener(this);
		pa.addActionListener(this);
		done.addActionListener(this);
/////
	saekDlg.setLayout(new FlowLayout(FlowLayout.RIGHT));
	saekDlg.setBackground(Color.lightGray); // background change
	saekDlg.pack();
	f.setSize(200,200);
	WindowDestroyer listener = new WindowDestroyer();
	f.addWindowListener(listener);
	f.setVisible(true);
	saekDlg.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		int r=0,g=0,b=0;
		if (e.getActionCommand() == "빨강") r=255;
		if (e.getActionCommand() == "초록") g=255;
		if (e.getActionCommand() == "파랑")  b=255;
		if(e.getActionCommand() == "확인") saekDlg.dispose();
		f.setBackground(new Color(r, g, b)); // background change
		f.repaint();                // frame renewal
	}
	public static void main(String[] args) {
		DialogDemo dd = new DialogDemo();   // frame construction
	}
}
