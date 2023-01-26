import javax.swing.*;               
import java.awt.event.*;           
import java.net.*;      
public class TestIPFinder extends JFrame implements ActionListener
{
    JLabel l,l2;                      
    JTextField TextF,TextF2;      
    JButton btn,btn2;       
    TestIPFinder()
    {
        super("IP Find (Dipak Mohite)");      
        l = new JLabel("Enter URL:"); 
        l2 = new JLabel();     
		l2.setBounds(100,320,125,80);
        TextF = new JTextField();
        TextF.setBounds(100,150,300,50);    
        btn = new JButton("Find IP Address");
        btn.setBounds(100,220,125,80);
        btn.addActionListener(this);
        add(l);  
		add(l2);		
        add(TextF);                               
        add(btn);                       
        setSize(600,600);                          
        setLayout(null);                          
        setVisible(true);                         
    }
    public void actionPerformed(ActionEvent ae)
    {
        String url=TextF.getText();  
        try
        {
            InetAddress iname = InetAddress.getByName(url);  
            String ipadd = iname.getHostAddress();
			l2.setText("IP = "+ipadd);
        }
        catch(UnknownHostException e)
        {
			l2.setText(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        TestIPFinder obj = new TestIPFinder();
    }
}