import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.color.*;

public class MainFunction{
    String test0 = "";
    String test1 = "";




    public static void main(String[] args) {
        String musicName = "GG";


       mainFrame(musicName);
        

    }
    
    
    
    static void mainFrame(String songName){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton play = new JButton();
        JButton next = new JButton();
        JButton previous = new JButton();
        JLabel songLabel = new JLabel();

        songLabel.setText(songName);
        songLabel.setBounds(200, 305, 100, 50);
        

        play.setBounds(200, 200, 100, 100);
        play.setText("Play");

        next.setBounds(305,200,100,100);
        next.setText("Next");

        previous.setBounds(95,200,100,100);
        previous.setText("Previous");

        panel.setSize(500,500);
        panel.add(play);
        panel.add(next);
        panel.add(previous);
        panel.setBackground(new Color(0,0,0));
        panel.setLayout(null);
        

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
