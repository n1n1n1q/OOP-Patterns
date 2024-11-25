package ua.edu.ucu.apps.image;


import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class ProxyImageTest {
    private ProxyImage proxyImage;
    private TestRealImage realImage;
    private static class TestRealImage extends RealImage {
        private int displayCount = 0;

        public TestRealImage(String path) {
            super(path);
        }

        @Override
        public void display() {
            displayCount++;
        }

        public int getDisplayCount() {
            return displayCount;
        }
    }

    @Before
    public void setUp() {
        Assume.assumeFalse("Skipping GUI tests in headless environment",
                GraphicsEnvironment.isHeadless());
        realImage = new TestRealImage("testPath");
        proxyImage = new ProxyImage("testPath") {
            @Override
            public void display() {
                if (realImage == null) {
                    realImage = new TestRealImage("testPath");
                }
                realImage.display();
            }
        };
    }

    @Test
    public void testDisplay() {
        proxyImage.display();
        assertEquals(1, realImage.getDisplayCount());
    }

    @Test
    public void testDisplayCalledTwice() {
        proxyImage.display();
        proxyImage.display();
        assertEquals(2, realImage.getDisplayCount());
    }
}