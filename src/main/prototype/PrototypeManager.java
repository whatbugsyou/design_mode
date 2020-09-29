package main.prototype;

import java.util.HashMap;

public class PrototypeManager {
    private HashMap<String,ProtypeAbs> hashMap = new HashMap<>();
    //添加原型
    public void addProtoType(String key,ProtypeAbs obj){
        hashMap.put(key,obj);
    }
    //获取原型的clone
    public ProtypeAbs getProtoType(String key){
        ProtypeAbs temp=hashMap.get(key);
        return temp.clone();
    }
}
