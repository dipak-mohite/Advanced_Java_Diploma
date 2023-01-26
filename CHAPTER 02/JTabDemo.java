import java.awt.*;
import javax.swing.*;

class pnl1 extends JPanel
{
	public pnl1()
	{
		JCheckBox jcb1 = new JCheckBox("RED");
		JCheckBox jcb2 = new JCheckBox("BLUE");
		JCheckBox jcb3 = new JCheckBox("GREEN");
		JCheckBox jcb4 = new JCheckBox("YELLOW");
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}

class pnl2 extends JPanel
{
	public pnl2()
	{
		JButton jb1 = new JButton("Chocolate");
		JButton jb2 = new JButton("Vanilla");
		JButton jb3 = new JButton("Stawberry");
		JButton jb4 = new JButton("Pineapple");
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
	}
}

class pnl3 extends JPanel
{
	public pnl3()
	{
		JComboBox jcb = new JComboBox();
		jcb.addItem("Circle");
		jcb.addItem("Oval");
		jcb.addItem("Rectangle");
		jcb.addItem("Square");
		add(jcb);
	}
}

public class JTabDemo extends JApplet
{
	public void start()
	{
		Container ct = getContentPane();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Colors", new pnl1());
		jtp.addTab("Flavours", new pnl2());
		jtp.addTab("Shapes", new pnl3());
		ct.add(jtp);
	}
}