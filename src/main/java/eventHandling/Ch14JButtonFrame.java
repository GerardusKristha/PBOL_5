package eventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
//public class Ch14JButtonFrame extends JFrame{
//    private static final int FRAME_WIDTH = 300;
//    private static final int FRAME_HEIGHT = 200;
//    private static final int FRAME_X_ORIGIN = 150;
//    private static final int FRAME_y_ORIGIN = 250;
//    private static final int BUTTON_WIDTH = 80;
//    private static final int BUTTON_HEIGHT = 30;
//    private JButton button;
//    
//    public static void main(String[] args) {
//        Ch14JButtonFrame frame = new Ch14JButtonFrame();
//        frame.setVisible(true);
//    }
//    public Ch14JButtonFrame(){
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new FlowLayout());
//        
//        setSize(FRAME_WIDTH,FRAME_HEIGHT);
//        setResizable(false);
//        setTitle("Program Ch7ButtonFrame");
//        setLocation(FRAME_X_ORIGIN,FRAME_y_ORIGIN);
//        
//        button = new JButton("Click Me");
//        button.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
//        contentPane.add(button);
//        
//        ButtonHandler handler = new ButtonHandler();
//        button.addActionListener(handler);
//        
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//}


//-- Soal 2


//public class Ch14JButtonFrame extends JFrame implements ActionListener{
//
//    private static final int FRAME_WIDTH = 300;
//    private static final int FRAME_HEIGHT = 200;
//    private static final int FRAME_X_ORIGIN = 150;
//    private static final int FRAME_y_ORIGIN = 250;
//    private static final int BUTTON_WIDTH = 80;
//    private static final int BUTTON_HEIGHT = 30;
//    private JButton button;
//
//    public static void main(String[] args) {
//        Ch14JButtonFrame frame = new Ch14JButtonFrame();
//        frame.setVisible(true);
//    }
//
//    public Ch14JButtonFrame() {
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new FlowLayout());
//
//        setSize(FRAME_WIDTH, FRAME_HEIGHT);
//        setResizable(false);
//        setTitle("Program Ch7ButtonFrame");
//        setLocation(FRAME_X_ORIGIN, FRAME_y_ORIGIN);
//
//        button = new JButton("Click Me");
//        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
//        contentPane.add(button);
//
//        button.addActionListener(this);
//
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton clickedButton = (JButton) e.getSource();
//        JRootPane rootPane = clickedButton.getRootPane();
//        Frame frame = (JFrame)rootPane.getParent();
//        String buttonText = clickedButton.getText();
//        
//        frame.setTitle("(Dibuat dengan cara - 2) You clicked "+ buttonText);
//    }
//}


//-- Soal 3

//public class Ch14JButtonFrame extends JFrame implements ActionListener{
//
//    private static final int FRAME_WIDTH = 300;
//    private static final int FRAME_HEIGHT = 200;
//    private static final int FRAME_X_ORIGIN = 150;
//    private static final int FRAME_y_ORIGIN = 250;
//    private static final int BUTTON_WIDTH = 80;
//    private static final int BUTTON_HEIGHT = 30;
//    private JButton button, button2;
//
//    public static void main(String[] args) {
//        Ch14JButtonFrame frame = new Ch14JButtonFrame();
//        frame.setVisible(true);
//    }
//
//    public Ch14JButtonFrame() {
//        Container contentPane = getContentPane();
//        contentPane.setLayout(new FlowLayout());
//
//        setSize(FRAME_WIDTH, FRAME_HEIGHT);
//        setResizable(false);
//        setTitle("Program Ch7ButtonFrame");
//        setLocation(FRAME_X_ORIGIN, FRAME_y_ORIGIN);
//
//        button = new JButton("Click Me");
//        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
//        contentPane.add(button);
//        button.addActionListener(this);
//        
//        button2 = new JButton("Tombol2");
//        button2.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
//        contentPane.add(button2);
//        button2.addActionListener(this);
//        
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton clickedButton = (JButton) e.getSource();
//        JRootPane rootPane = clickedButton.getRootPane();
//        Frame frame = (JFrame)rootPane.getParent();
//        String buttonText = clickedButton.getText();
//        
//        if(buttonText.equals("Click Me")){
//            frame.setTitle("(Dibuat dengan cara - 2) You clicked "+ buttonText);
//        }else{
//            frame.setTitle("You clicked "+ buttonText);
//        }
//        
//    }
//}




//--Soal 4


public class Ch14JButtonFrame extends JFrame implements ActionListener{

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button, button2;
    private JTextField pesan;

    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }

    public Ch14JButtonFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7ButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_y_ORIGIN);

        button = new JButton("Click Me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        button.addActionListener(this);
        
        button2 = new JButton("Tombol2");
        button2.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
        contentPane.add(button2);
        button2.addActionListener(this);
        
        pesan = new JTextField();
        pesan.setColumns(20);
        contentPane.add(pesan);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame)rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        if(buttonText.equals("Click Me")){
            String isiPesan = pesan.getText();
            frame.setTitle(isiPesan);
        }else{
            frame.setTitle("You clicked "+ buttonText);
        }
        
    }
}
