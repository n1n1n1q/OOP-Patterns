package ua.edu.ucu.apps.image;

import lombok.Getter;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;

@Getter
public class RealImage implements MyImage {
    private JFrame frame;
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Loading " + filename + " (headless mode)");
            return;
        }

        if (frame == null) {
            frame = new JFrame();
            ImageIcon icon = new ImageIcon(filename);
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
        }
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}