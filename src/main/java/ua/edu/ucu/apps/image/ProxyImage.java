package ua.edu.ucu.apps.image;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String path;

    public ProxyImage(String path) {
        this.path = path;
    }
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(path);
        }
        realImage.display();
    }
}
