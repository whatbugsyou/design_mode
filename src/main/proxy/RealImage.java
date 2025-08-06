package main.proxy;

public class RealImage implements Image {
    private String filename;
    private boolean isLoaded;
    
    public RealImage(String filename) {
        this.filename = filename;
        this.isLoaded = false;
    }
    
    @Override
    public void loadFromDisk() {
        if (!isLoaded) {
            System.out.println("Loading image from disk: " + filename);
            // Simulate time-consuming operation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            isLoaded = true;
            System.out.println("Image loaded successfully: " + filename);
        }
    }
    
    @Override
    public void display() {
        if (!isLoaded) {
            loadFromDisk();
        }
        System.out.println("Displaying image: " + filename);
    }
    
    public boolean isLoaded() {
        return isLoaded;
    }
}