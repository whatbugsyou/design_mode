package main.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Caching proxy that manages a cache of images
 */
public class CachingImageProxy implements Image {
    private String filename;
    private static Map<String, RealImage> imageCache = new HashMap<>();
    
    public CachingImageProxy(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void display() {
        RealImage cachedImage = imageCache.get(filename);
        if (cachedImage == null) {
            System.out.println("Image not in cache, creating new instance: " + filename);
            cachedImage = new RealImage(filename);
            imageCache.put(filename, cachedImage);
        } else {
            System.out.println("Image found in cache: " + filename);
        }
        cachedImage.display();
    }
    
    @Override
    public void loadFromDisk() {
        RealImage cachedImage = imageCache.get(filename);
        if (cachedImage == null) {
            System.out.println("Image not in cache, creating new instance: " + filename);
            cachedImage = new RealImage(filename);
            imageCache.put(filename, cachedImage);
        } else {
            System.out.println("Image found in cache: " + filename);
        }
        cachedImage.loadFromDisk();
    }
    
    public static void clearCache() {
        imageCache.clear();
        System.out.println("Cache cleared");
    }
    
    public static int getCacheSize() {
        return imageCache.size();
    }
}