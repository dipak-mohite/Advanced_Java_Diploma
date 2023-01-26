import java.awt.*;
import java.applet.*;
public class label_button extends Applet {
	Label l1, l2;
	Button b1, b2;
	public void init()
	{
		l1= new Label();
		l2= new Label("Surname");
		b1=new Button();
		b2=new Button("Submit");
		
		l1.setText("First Name");
		l1.setAlignment(Label.RIGHT);
		b1.setLabel("Reset");
		
		add(l1);
		add(b1);
		add(l1);
		add(b2);
		
		
		
	}
}