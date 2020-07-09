package com.jiandanjiuer.iteratle;

import com.jiandanjiuer.student.stuDent;

import java.util.ArrayList;

/**
 * @author 24245
 */
public class ArrayListImpl {

    public ArrayListImpl() {
    }

    //定义一个静态枚举类
    enum stuDentsEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private ArrayList stuDents;

        //私有化枚举的构造函数
        stuDentsEnum() {
            stuDents = new ArrayList<stuDent>();
        }

        public ArrayList getStuDents() {
            return stuDents;
        }
    }

    //对外暴露一个获取stuDents对象的静态方法
    public static ArrayList getArrayList() {
        return stuDentsEnum.INSTANCE.getStuDents();
    }
}
