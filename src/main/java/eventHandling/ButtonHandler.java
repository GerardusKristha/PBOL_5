package eventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class ButtonHandler implements ActionListener{

    public ButtonHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton)event.getSource();
        
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame)rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        frame.setTitle("You clicked "+ buttonText);
    }
}
