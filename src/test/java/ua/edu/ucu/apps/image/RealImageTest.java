package ua.edu.ucu.apps.image;

import org.junit.Test;
import javax.swing.JFrame;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RealImageTest {

    @Test
    public void testRealImageConstructor() {
        RealImage realImage = new RealImage("test.jpg");
        assertNotNull(realImage);
    }

    @Test
    public void testDisplay() {
        RealImage realImage = new RealImage("test.jpg");
        realImage.display();
        JFrame frame = realImage.getFrame();
        assertTrue(frame.isVisible());
    }
}