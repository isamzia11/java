package GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public class Main 
{
    public static void main(String[] args) 
    {
      // JPanel = IS a GUI component which functions as a continer to hold other components
      ImageIcon image = new ImageIcon("Luffy1.JPG");
      Label l = new Label();
      l.setText("HI");
    
     
      JPanel redpanel = new JPanel();
      redpanel.setBackground(Color.red);
      redpanel.setBounds(0, 0, 250, 250);
      

      JPanel greenpanel = new JPanel();
      greenpanel.setBackground(Color.green);
      greenpanel.setBounds(0, 240, 250, 250);

      JPanel bluePanel = new JPanel();
      bluePanel.setBackground(Color.blue);
      bluePanel.setBounds(240, 0, 250, 250);

      JPanel yellowPanel = new JPanel();
      yellowPanel.setBackground(Color.yellow);
      yellowPanel.setBounds(240, 240, 250, 250);
      
      JFrame frame = new JFrame();
      frame.setTitle("Jframe"); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setVisible(true); 
      redpanel.add(l);
      frame.add(redpanel);
      frame.add(greenpanel);
      frame.add(bluePanel);
      frame.add(yellowPanel);
      
  }        
    
}
   

