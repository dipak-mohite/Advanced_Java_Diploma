import java.awt.*;
import java.applet.*;
public class flowlayoutdemo extends Applet {
	Checkbox cb1, cb2;
	CheckboxGroup cbg;
	public void init()
	{
		FlowLayout f = new FlowLayout(FlowLayout.RIGHT);
		setLayout(f);
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("Apple", cbg, true);
		cb2 = new Checkbox("One plus", cbg, true);
		
		add(cb1);
		add(cb2);
		
		
		
	}
}