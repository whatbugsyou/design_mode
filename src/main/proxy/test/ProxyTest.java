package main.proxy.test;

import main.proxy.*;

public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");
        
        // Test 1: Virtual Proxy (lazy loading)
        System.out.println("1. Testing Virtual Proxy (lazy loading):");
        Image image1 = new ImageProxy("photo1.jpg");
        System.out.println("Proxy created, but image not loaded yet");
        System.out.println("First display call:");
        image1.display();
        System.out.println("Second display call (should be faster):");
        image1.display();
        System.out.println();
        
        // Test 2: Protection Proxy (access control)
        System.out.println("2. Testing Protection Proxy (access control):");
        ImageProxy protectedImage = new ImageProxy("secret.jpg", false);
        System.out.println("Trying to display protected image:");
        protectedImage.display();
        System.out.println("Granting access:");
        protectedImage.setAccessAllowed(true);
        protectedImage.display();
        System.out.println();
        
        // Test 3: Caching Proxy
        System.out.println("3. Testing Caching Proxy:");
        Image cachingProxy1 = new CachingImageProxy("logo.png");
        Image cachingProxy2 = new CachingImageProxy("logo.png"); // Same image
        
        System.out.println("First access to logo.png:");
        cachingProxy1.display();
        System.out.println("\nSecond access to logo.png (from different proxy):");
        cachingProxy2.display();
        
        System.out.println("\nCache size: " + CachingImageProxy.getCacheSize());
        
        System.out.println("\nAccessing different image:");
        Image cachingProxy3 = new CachingImageProxy("banner.jpg");
        cachingProxy3.display();
        
        System.out.println("\nCache size: " + CachingImageProxy.getCacheSize());
        
        System.out.println("\nClearing cache:");
        CachingImageProxy.clearCache();
        System.out.println("Cache size: " + CachingImageProxy.getCacheSize());
        
        // Test 4: Comparison with direct object creation
        System.out.println("\n4. Comparison with direct object creation:");
        System.out.println("Direct RealImage creation:");
        RealImage directImage = new RealImage("direct.jpg");
        System.out.println("Image created immediately");
        directImage.display();
        
        System.out.println("\nVs Proxy creation:");
        ImageProxy proxyImage = new ImageProxy("proxy.jpg");
        System.out.println("Proxy created, real image not created yet");
        System.out.println("Is image loaded? " + proxyImage.isImageLoaded());
        proxyImage.display();
        System.out.println("Is image loaded? " + proxyImage.isImageLoaded());
    }
}