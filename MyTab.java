import java.awt.*;
import javax.swing.*;
public class MyTab extends JApplet
{
	public void init()
	{
        Container c = getContentPane();
		
		JTabbedPane jp=new JTabbedPane();
		
		JPanel jp1= new JPanel();
		JPanel jp2= new JPanel();
		
		jp1.add(new JButton("First Button"));
		jp1.add(new JButton("Second Button"));
		
		jp2.add(new JCheckBox("OSY",true));
		jp2.add(new JCheckBox("EST",false));
		
  
		jp.addTab("Numbers",jp1);
		jp.addTab("Subjects",jp2);
		
		c.add(jp);
	}
}