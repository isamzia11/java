package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI2
{
   public static void main(String[] args)
{
    // label is a GUI display area for a string of text an image or both
   
    JLabel label = new JLabel(); // we can also set text by writing it in this parenthesis
    label.setText("Monkey D luffy"); // sets text of label
    ImageIcon image = new ImageIcon("Capture.PNG");
    Border border = BorderFactory.createLineBorder(Color.GREEN,3);

    label.setIcon(image);
    label.setHorizontalTextPosition(label.RIGHT); // sets text position
    label.setVerticalTextPosition(label.CENTER);
    label.setForeground(new Color(150,150,200));
    label.setFont(new Font("MV Boli", Font.PLAIN, 60)); // sets font of text 
    label.setIconTextGap(10); // sets gap between icon text
    label.setBackground(Color.BLACK); // sets the background color
    label.setOpaque(true); // displays the background color
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
   // label.setBounds(500,1200,250,250);

   

    JFrame frame = new JFrame();
    frame.setTitle("Jframe"); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true); 
    frame.add(label);
    frame.pack();
    
    }
}
