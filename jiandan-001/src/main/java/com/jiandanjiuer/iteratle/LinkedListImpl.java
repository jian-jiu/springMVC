package com.jiandanjiuer.iteratle;

import com.jiandanjiuer.student.stuDent;

import java.util.LinkedList;

/**
 * @author 24245
 */
public class LinkedListImpl {

    public LinkedListImpl() {
    }

    //定义一个静态枚举类
    enum stuDentsEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private LinkedList stuDents;

        //私有化枚举的构造函数
        stuDentsEnum() {
            stuDents = new LinkedList<stuDent>();
        }

        public LinkedList getStuDents() {
            return stuDents;
        }
    }

    //对外暴露一个获取stuDents对象的静态方法
    public static LinkedList getLinkedList() {
        return LinkedListImpl.stuDentsEnum.INSTANCE.getStuDents();
    }
}
