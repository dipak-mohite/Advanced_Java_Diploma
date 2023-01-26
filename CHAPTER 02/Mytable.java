import javax.swing.*;
import java.awt.*;


public class Mytable extends JApplet{
	public void init()
	{
		String cols[] = {"Name", "Roll", "Marks"};
		String data[][] = {{"ABC", "20", "97.6"},{"XYZ", "21", "90.5"},{"MNO", "22", "92.4"}};
		JTable jt = new JTable(data,cols);
		JScrollPane jp = new JScrollPane(jt);
		add(jp);
	}
    
}
