import java.applet.*;
import java.awt.*;
public class BorderDemo extends Applet
{
  Button b1;
  public void init()
 {
  setLayout(new BorderLayout(10,5));
  
  b1=new Button("First");
  add(b1,BorderLayout.WEST);
 
  add(new Button("Third"),BorderLayout.NORTH);
  add(new Button("Fourth"),BorderLayout.SOUTH);
  
  Panel p=new Panel();
  Checkbox cb1=new Checkbox("ONE");
  Checkbox cb2=new Checkbox("TWO");
  p.add(cb1);
  p.add(cb2);

 add(p,BorderLayout.CENTER);
 }
}