package com.jiandanjiuer.iteratle;

import com.jiandanjiuer.student.stuDent;

import java.util.HashMap;

public class HashMapImpl {
    public HashMapImpl() {
    }

    //定义一个静态枚举类
    enum stuDentsEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private HashMap<String, stuDent> stuDents;

        //私有化枚举的构造函数
        stuDentsEnum() {
            stuDents = new HashMap<>();
        }

        public HashMap<String, stuDent> getHashMap() {
            return stuDents;
        }
    }

    //对外暴露一个获取stuDents对象的静态方法
    public static HashMap<String, stuDent> getArrayList() {
        return HashMapImpl.stuDentsEnum.INSTANCE.getHashMap();
    }
}
