import java.awt.*;
import javax.swing.*;
public class Tabbed extends JApplet
{
	public void init()
	{
		
     JTabbedPane t=new JTabbedPane();
     Container cp=new getContentPane();
     JPanel p1=new JPanel();
     JPanel p2=new JPanel();
     p1.add(new JLabel("General Seetings"));
     p2.add(new JLabel("Properties Settings"));
     p3.add(new JLabel("Security Settings"));
  
     t.addTab("General",p1);
     t.addTab("Properties",p2);
     t.addTab("Security",p3);
	  cp.add(t);
    }
}