package color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class ColorSwift extends JFrame{
    private JButton yellowButton,redButton;
    public static void main(String[] args) {
        new ColorSwift();
    }
    public ColorSwift(){
        
        setSize(500,500);
        setTitle("Color Swift Background");
        setLayout(null);
        
        yellowButton = new JButton("YELLOW");
        yellowButton.setForeground(Color.BLACK);
        yellowButton.setBounds(50, 10, 100, 80);
        yellowButton.addActionListener(new YellowButtonLis());
        yellowButton.setBackground(Color.white);
        this.add(yellowButton);
        
        redButton = new JButton("RED");
        redButton.setForeground(Color.BLACK);
        redButton.setBounds(330, 10, 100, 80);
        redButton.addActionListener(new RedButtonLis());
        redButton.setBackground(Color.white);
        this.add(redButton);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    class YellowButtonLis implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            JButton button = (JButton) actionEvent.getSource();
            JFrame frame = (JFrame) SwingUtilities.getRoot(button);
            frame.getContentPane().setBackground(Color.YELLOW);
            
        }
    }
    
    class RedButtonLis implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            JButton button = (JButton) actionEvent.getSource();
            JFrame frame = (JFrame) SwingUtilities.getRoot(button);
            frame.getContentPane().setBackground(Color.RED);
            
        }
    }
}
