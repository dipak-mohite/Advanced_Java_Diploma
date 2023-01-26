import java.awt.*;
import java.applet.*;
public class TextareaDemo extends Applet {
	TextArea t1, t2, t3, t4;

	public void init()
	{
            Panel p=new Panel();
            Checkbox cb1=new Checkbox("Java",true);
		//simple
		t1 = new TextArea();
		t2 = new TextArea(3,10);
		t3 = new TextArea("Enter a comment",5,15);
		//t4 = new TextArea("Enter a comment",7,20,t4.SCROLLBAR_BOTH);
	
		//
		

		add(t1);
		add(t2);
		add(t3);
		add(t4);
		p.add(cb1);
	        
		
		
	}
}