import java.awt.*;
import java.applet.*;
public class TextfieldDemo extends Applet {
	TextField t1, t2, t3;

	public void init()
	{
		//simple texfield
		t1 = new TextField();
		//specified width of texfield
		t2 = new TextField(15);
		//with string
		t3= new TextField("Enter your name here", 20);
		

		add(t1);
		add(t2);
		add(t3);
		
		
		
		
	}
}