import java.applet.*;
import java.awt.*;
public class BorderDemo extends Applet
{
  Label l1;
  public void init()
 {
  setLayout(new BorderLayout(10,5));
  
  l1=new Label("First");
  add(l1,BorderLayout.WEST);
 
  add(new Label("Third"),BorderLayout.NORTH);
  add(new Label("Fourth"),BorderLayout.SOUTH);
  
  Panel p=new Panel();
  Checkbox cb1=new Checkbox("ONE");
  Checkbox cb2=new Checkbox("TWO");
  p.add(cb1);
  p.add(cb2);

 add(p,BorderLayout.CENTER);
 }
}