package main.prototype;

import java.util.HashMap;

public class PrototypeManager {
    private HashMap<Class,ProtypeAbs> hashMap = new HashMap<>();
    //添加原型
    public void addProtoType(Class clazz,ProtypeAbs obj){
        hashMap.put(clazz,obj);
    }
    //获取原型的clone
    public ProtypeAbs getProtoType(Class clazz){
        ProtypeAbs temp=hashMap.get(clazz);
        return temp.clone();
    }
}
