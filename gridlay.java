import java.awt.*;
import java.applet.*;
public class gridlay extends Applet {
	Button b1, b2, b3, b4, b5;
	Checkbox cb1, cb2;
	public void init()
	{
		/*GridLayout()	: This layout arrange the componend in 2D grid, it has number of rows and columns.
		
		Constructors:-
		1) GridLayout();
			per compoment in a row
		2) GridLayout(int rows, int columns);
			this will specify number of rows and columns 
		3) GridLayout(int rows, int columns, int horz, int ver);
			this constructor specify number of rows and columns  with horizontal and vertical gap in pixel
		*/	
		
		setLayout(new GridLayout(4,4));
		
		int n=0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				add(new Button(""+n));
				n++;
			}
		}
		/*
		
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
		add(p,BorderLayout.CENTER);		*/
	}
}