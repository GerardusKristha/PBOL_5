package eventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class InputFormFrame extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private static final int LABEL_WIDTH = 150;
    private static final int LEFT_MARGIN = 30;
    private JLabel labelBil_1, labelBil_2, labelHasil;
    private JButton button;
    private JTextField input_1, input_2, hasil;
    private Color color1, color2,color3;
    public static void main(String[] args) {
        InputFormFrame frame = new InputFormFrame();
        frame.setVisible(true);
    }

    public InputFormFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Input Data");
        setLocation(FRAME_X_ORIGIN, FRAME_y_ORIGIN);
        color1 = new Color(230,244,253);
        color2 = new Color(9,87,134);
        contentPane.setBackground(color1);
        
        labelBil_1 = new JLabel("Bilangan 1 ");
        labelBil_1.setForeground(color2);
        labelBil_1.setBounds(LEFT_MARGIN, 20, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelBil_1);
        
        input_1 = new JTextField();
        input_1.setBounds(LEFT_MARGIN+BUTTON_WIDTH, 20, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(input_1);
        input_1.addActionListener(this);
        
        labelBil_2 = new JLabel("Bilangan 2 ");
        labelBil_2.setForeground(color2);
        labelBil_2.setBounds(LEFT_MARGIN, 25+BUTTON_HEIGHT, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelBil_2);
        
        input_2 = new JTextField();
        input_2.setBounds(LEFT_MARGIN+BUTTON_WIDTH, 25+BUTTON_HEIGHT, LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(input_2);
        input_2.addActionListener(this);
        
        labelHasil = new JLabel("Hasil ");
        labelHasil.setForeground(color2);
        labelHasil.setBounds(LEFT_MARGIN, 30+(2*BUTTON_HEIGHT), LABEL_WIDTH, BUTTON_HEIGHT);
        contentPane.add(labelHasil);
        
        hasil = new JTextField();
        hasil.setBounds(LEFT_MARGIN+BUTTON_WIDTH, 30+(2*BUTTON_HEIGHT), LABEL_WIDTH, BUTTON_HEIGHT);
        hasil.setEditable(false);
        hasil.setBackground(Color.WHITE);
        hasil.setForeground(color2);
        contentPane.add(hasil);
                
        button = new JButton("Jumlah");
        button.setBackground(color2);
        button.setForeground(color1);
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button.setBounds(LEFT_MARGIN+BUTTON_WIDTH, 35+(3*BUTTON_HEIGHT), BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        button.addActionListener(this);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame frame = (JFrame)rootPane.getParent();
        int hasilInput = Integer.parseInt(input_1.getText()) + Integer.parseInt(input_2.getText());
        String hasilJumlah = String.valueOf(hasilInput);
        hasil.setText(hasilJumlah);
    }
}
