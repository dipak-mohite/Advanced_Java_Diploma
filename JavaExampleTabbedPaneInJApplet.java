import java.awt.*;
import javax.swing.*;
public class TabbedDemo extends JApplet
  {
     public void init()
      {
        Container c = getContentPane();
        JTabbedPane tp = new JTabbedPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
		
        p1.add(new JLabel("This is Chat section"));
        p2.add(new JLabel("This is Status section"));
        p3.add(new JLabel("This is Calls section"));
		
        tp.addTab("Chats",p1);
        tp.addTab("Status",p2);
        tp.addTab("Calls",p3);
		
        c.setLayout(new BorderLayout());
        c.add(tp);
    }
}