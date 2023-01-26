import java.awt.*;
import java.applet.*;
public class checkbox extends Applet {
	Checkbox cb1, cb2, cb3, cb4;
	public void init()
	{
		cb1 = new Checkbox("Infinix", true);
		cb2 = new Checkbox("Apple");
		cb2 = new Checkbox("Oppo");
		cb2 = new Checkbox("Samsung");
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
	}
}