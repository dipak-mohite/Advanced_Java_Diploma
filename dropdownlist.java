import java.awt.*;
import java.applet.*;
public class listdemo extends Applet {
	List l1, l2;
	Button b1, b2;
	public void init()
	{
		l1= new List();
		l2= new List(4,true);
		l1.add("AJP");
		l1.add("CSS");
		l1.add("STE");
		l2.add("Computer Engineering");
		l2.add("Civil Engineering");
		l2.add("Electronics Engineering");
		l2.add("Mechanical Engineering");
		
		add(l1);
		add(l2);
		
		
		
	}
}