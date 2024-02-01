import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;

public class mainFrame {
   mainFrame(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();

        

        button.setBounds(200, 200, 100, 100);

        panel.setSize(500,500);
        panel.add(button);
        panel.setBackground(new Color(0,0,0));
        panel.setLayout(null);
        

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(panel);
    }
    
}