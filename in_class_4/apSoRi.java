import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class apSoRi extends Applet implements ActionListener {
	private static List  srLst;
	public apSoRi() {
		srLst = new List(10, false);
		srLst.add("tok");   srLst.add("tak"); srLst.add("tik");
		srLst.add("wok");  srLst.add("ah");  srLst.add("beep");
		srLst.add("bong"); srLst.add("jaekjaek"); srLst.add("to_to_to");
		srLst.add("tiriring");  srLst.add("kwoik");  srLst.add("turururuk");
		srLst.add("janmulgyul"); srLst.add("gicha");
		srLst.addActionListener(this);
		Panel p = new Panel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p.add(srLst);
		add("East", p);                   // panel p arrangement -> east
		srLst.setBackground(Color.white); // srLst background -> white
		repaint();
	}
	public void init(){
		setSize(500, 300);
	}
	public void actionPerformed(ActionEvent e) {
		String sori = "sori/" + e.getActionCommand() +".au";
		play(getDocumentBase(), sori);     //  sound
	}
}
