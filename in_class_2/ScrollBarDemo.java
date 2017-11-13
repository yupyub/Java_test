import java.awt.*;
import java.awt.event.*;
public class ScrollBarDemo implements AdjustmentListener {
	private Frame f;
	private Scrollbar rScr, gScr, bScr;
	private Label     rLbl, gLbl, bLbl;
	public ScrollBarDemo() {
		f = new Frame("ScrollBar Test");
		Panel p = new Panel();
		p.setLayout(new GridLayout(2,3, 5,0)); // partition 2 * 3
		f.setSize(500,300);
		f.add("North", p); // arrange panel p to the north of frame
		p.add(rLbl = new Label("빨강")); // arrange label in panel p
		p.add(gLbl = new Label("초록"));
		p.add(bLbl = new Label("파랑")); // arrange Scrollbar in p panel
		p.add(rScr = new Scrollbar(Scrollbar.HORIZONTAL,  50, 0, 0, 255));
		p.add(gScr = new Scrollbar(Scrollbar.HORIZONTAL, 100, 0, 0, 255));
		p.add(bScr = new Scrollbar(Scrollbar.HORIZONTAL, 200, 0, 0, 255));
		rScr.addAdjustmentListener(this);
		gScr.addAdjustmentListener(this);
		bScr.addAdjustmentListener(this); // increase/decrease amount when you press arrow button in scroll bar
		rScr.setBlockIncrement(30);
		gScr.setBlockIncrement(30);
		bScr.setBlockIncrement(30); // setting background of scrollbar
		rScr.setBackground(Color.red);
		gScr.setBackground(Color.green);
		bScr.setBackground(Color.blue);
		WindowDestroyer listener = new WindowDestroyer();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (  e.getAdjustmentType() == e.UNIT_INCREMENT   ||
		e.getAdjustmentType() == e.BLOCK_INCREMENT  ||
		e.getAdjustmentType() == e.UNIT_DECREMENT ||
		e.getAdjustmentType() == e.BLOCK_DECREMENT ||
		e.getAdjustmentType() == e.TRACK) {
			int r = rScr.getValue();        // value of bar in scroll bar
			int g = gScr.getValue();
			int b = bScr.getValue();
			f.setBackground(new Color(r, g, b)); // background change
			rLbl.setText("빨강 : " + r); // for change of label value
			gLbl.setText("초록 : " + g);
			bLbl.setText("파랑 : " + b);
			f.repaint();         // repainting
		}
	}
	public static void main(String[] args) {
		ScrollBarDemo sb = new ScrollBarDemo();
	}
}
