package main.flyweight;

import java.util.HashMap;

public class Pool {
    private static final HashMap<String, Base> baseObjectPool = new HashMap<>();

    public static Base getBase(String property) {
        if (baseObjectPool.containsKey(property)) {
            return baseObjectPool.get(property);
        } else {
            Base base = new Base(property);
            baseObjectPool.put(property, base);
            return base;
        }
    }
}
