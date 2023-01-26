import javax.swing.*;
import java.awt.*;


public class JFrameDemo extends JFrame{
    public JFrameDemo()
    {
        Container ct= getContentPane();
        JLabel jl= new JLabel("Welcome to Swing Chapter");
        ct.add(jl);
    }
    public static void main() {
        JFrameDemo fd = new JFrameDemo();
        fd.setTitle("Demonstraining Swing");
        fd.setSize(300,300);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fd.setVisible(true);
        
    }
}
