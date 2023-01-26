import javax.swing.*;  
public class TabbedPaneExample {  
JFrame f;  
TabbedPaneExample(){  
    f=new JFrame();  
	JRadioButton r = new JRadioButton("Pineapple");
	JRadioButton r1 = new JRadioButton("Banana");
	JRadioButton r2 = new JRadioButton("Oranges");
	JRadioButton r3 = new JRadioButton("Lime");
	ButtonGroup bg = new ButtonGroup();
	bg.add(r);
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	Container cp = getContentPane();
	JPanel p1=new JPanel();  
	cp.add(r);
	cp.add(r1);
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("Fruit",p1);  
    tp.add("Flower",p2);  
    tp.add("Others",p3);    
    f.add(tp);  
    f.setSize(400,400); 
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TabbedPaneExample();  
}}  