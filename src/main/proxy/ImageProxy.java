package main.proxy;

public class ImageProxy implements Image {
    private String filename;
    private RealImage realImage;
    private boolean accessAllowed;
    
    public ImageProxy(String filename) {
        this.filename = filename;
        this.accessAllowed = true; // Default access
    }
    
    public ImageProxy(String filename, boolean accessAllowed) {
        this.filename = filename;
        this.accessAllowed = accessAllowed;
    }
    
    @Override
    public void display() {
        if (!accessAllowed) {
            System.out.println("Access denied: Cannot display " + filename);
            return;
        }
        
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
    
    @Override
    public void loadFromDisk() {
        if (!accessAllowed) {
            System.out.println("Access denied: Cannot load " + filename);
            return;
        }
        
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.loadFromDisk();
    }
    
    public void setAccessAllowed(boolean accessAllowed) {
        this.accessAllowed = accessAllowed;
    }
    
    public boolean isAccessAllowed() {
        return accessAllowed;
    }
    
    public boolean isImageLoaded() {
        return realImage != null && realImage.isLoaded();
    }
}