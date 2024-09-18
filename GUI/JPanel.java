package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jpanel 
{
    // JPanel = AGUI component which functions as a container to hold other components
    public static void main(String[] args) 
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
            
        JFrame frame = new JFrame();
        frame.setTitle("Jframe"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true); 
        
    }
    
}
