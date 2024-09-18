package GUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class GUI1 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();  // creates the frame
        frame.setTitle("Jframe"); // sets the title name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the frame when we click on cross
        frame.setResizable(false); // now we cannot change the frame size through mouse
        frame.setSize(500,400); // sets the x & y dimension
        
        ImageIcon image = new ImageIcon("luffy.jpeg");// crate an image icon
        frame.setIconImage(image.getImage()); // changes icon of the frame
        frame.setVisible(true);    // makes the frame visible
        frame.getContentPane().setBackground(new Color(100,150,50)); // changes bACKGROUND COLOUR
         // 1st number represents red 2nd green and 3rd blue

         

    }
}
