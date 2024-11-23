package ua.edu.ucu.apps.image;

import lombok.Getter;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@Getter
public class RealImage implements MyImage {
    private JFrame frame;

    public RealImage(String filename) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }
}