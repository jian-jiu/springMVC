package com.jiandanjiuer.student;

import lombok.*;

@Data
public class stuDent {
    private int id;
    //    学号
    private int studentNumber;
    //    名字
    private String name;
    //    年龄
    private int age;
    //    性别
    private String sex;

    public stuDent() {
        System.out.println("stuDent加载了");
    }

    public stuDent(int studentNumber, String name, int age, String sex) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public stuDent(int id, int studentNumber, String name, int age, String sex) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
