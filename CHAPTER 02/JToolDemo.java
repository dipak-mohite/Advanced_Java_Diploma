import javax.swing.*;
import java.awt.*;


public class JToolDemo extends JApplet{
	public void init()
	{
		Container cp = getContentPane();
		JButton jb1 = new JButton("SUBMIT");
		add(jb1);
		jb1.setToolTipText("Press this button to submit");
	}
    
}
