import java.awt.*;
import java.applet.*;
public class borderlay extends Applet {
	Button b1, b2, b3, b4, b5;
	Checkbox cb1, cb2;
	public void init()
	{
		/*BorderLayout()			 ___________________
		Constructor :- 				|______NORTH________|
		BorderLayout.EAST			|	|			|	|
		BorderLayout.WEST			|WE	|  CENTER	|EA	|
		BorderLayout.CENTER			|ST	|			|ST	|
		BorderLayout.NORTH			|___|___________|___|
		BorderLayout.SOUTH			|_______SOUTH_______|
		
		Container :
		void add(Component cmp, Object Region);
		viod add(Component cmp);	*/
		BorderLayout bl= new BorderLayout(10,5);
		setLayout(bl);
	
		b1 = new Button("WEST");
		add(b1,BorderLayout.WEST);
		b2 = new Button("NORTH");
		add(b2,BorderLayout.NORTH);	
		b3 = new Button("EAST");
		add(b3,BorderLayout.EAST);	
		b4 = new Button("SOUTH");
		add(b4,BorderLayout.SOUTH);	
		
		Panel p = new Panel();
		Checkbox cb1 = new Checkbox("1st Option");
		Checkbox cb2 = new Checkbox("2nd Option");
		p.add(cb1);
		p.add(cb2);	
		add(p,BorderLayout.CENTER);		
	}
}