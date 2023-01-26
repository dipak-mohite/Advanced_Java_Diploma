import java.awt.*;

//simple CheckboxGroup program in AWT
//created by : Dipak Mohite (Enrollment:1901180310)

public class notepad extends Frame {
	public notepad()
	{
		MenuBar mb=new MenuBar();  
        Menu menu=new Menu("File");  
        MenuItem i1=new MenuItem("New");  
        MenuItem i2=new MenuItem("New Window");  
        MenuItem i3=new MenuItem("Open");  
        MenuItem i4=new MenuItem("Save");  
        MenuItem i5=new MenuItem("Save as"); 
        MenuItem i6=new MenuItem("Print");  
        MenuItem i7=new MenuItem("Exit");  
        menu.add(i1);  
        menu.add(i2);  
        menu.add(i3);  
        menu.add(i4);  
        menu.add(i5);  
        menu.add(i6);  
        menu.add(i7);  
        Menu menu2=new Menu("Edit");  
        MenuItem mi1=new MenuItem("Undo");  
        MenuItem mi2=new MenuItem("Cut");  
        MenuItem mi3=new MenuItem("Copy");  
        MenuItem mi4=new MenuItem("Paste");  
        MenuItem mi5=new MenuItem("Delete"); 
        MenuItem mi6=new MenuItem("Search with bing");  
        MenuItem mi7=new MenuItem("Find");  
        MenuItem mi8=new MenuItem("Find Next");  
        MenuItem mi9=new MenuItem("Find Previous");  
        MenuItem mi10=new MenuItem("Reaplace");  
        MenuItem mi11=new MenuItem("Go To");  
        MenuItem mi12=new MenuItem("Select All");  
        MenuItem mi13=new MenuItem("Time and Date");  
        menu2.add(mi1);  
        menu2.add(mi2);  
        menu2.add(mi3);  
        menu2.add(mi4);  
        menu2.add(mi5);  
        menu2.add(mi6);  
        menu2.add(mi7);
        menu2.add(mi8);  
        menu2.add(mi9);  
        menu2.add(mi10);  
        menu2.add(mi11);  
        menu2.add(mi12);  
        menu2.add(mi13);
        Menu menu3=new Menu("View");  
        Menu submenu=new Menu("Zoom");  
        MenuItem m3i1=new MenuItem("Zoom In");  
        MenuItem m3i2=new MenuItem("Zoom Out");  
        MenuItem m3i3=new MenuItem("Status Bar");  
        submenu.add(m3i1);  
        submenu.add(m3i2);
        menu3.add(submenu);   
        menu3.add(m3i3);
        Menu menu4=new Menu("Help");  
        MenuItem m4i1=new MenuItem("View Help");  
        MenuItem m4i2=new MenuItem("Send Feedback");  
        MenuItem m4i3=new MenuItem("About Notepad+++");  
        menu4.add(m4i1);  
        menu4.add(m4i2);  
        menu4.add(m4i3); 
        mb.add(menu);  
        mb.add(menu2);  
        mb.add(menu3);  
        mb.add(menu4);  
        setMenuBar(mb);  
        TextArea t1 = new TextArea(1366,768);
        t1.setBounds(10,50,30,40);
        Font font = new Font("Segoe Script", Font.BOLD, 20);
        t1.setFont(font);
        t1.setForeground(Color.BLACK);
        add(t1);
	}
	
	public static void main(String args[])
	{
		  notepad frame = new notepad(); 
          frame.setTitle("Notepad+++"); 
          frame.setSize(1366,768); 
          frame.setVisible(true); 	
	}
	
}