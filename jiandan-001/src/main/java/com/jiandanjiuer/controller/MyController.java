package com.jiandanjiuer.controller;

import com.jiandanjiuer.iteratle.ArrayListImpl;
import com.jiandanjiuer.student.stuDent;
import com.jiandanjiuer.tools.Ip;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RequestMapping("/test/")
@Controller
public class MyController {

    @RequestMapping(value = "some.do")
    public ModelAndView dosome(@RequestParam(value = "rid", required = false) Integer id,
                               @RequestParam(value = "rnum") Integer num,
                               @RequestParam(value = "rname") String name,
                               @RequestParam(value = "rage", required = false) Integer age,
                               @RequestParam(value = "rsex", required = false) String sex,
                               HttpServletRequest request) {
        System.out.println("访问者ip是：" + Ip.getIpAddress(request));
        ModelAndView mv = new ModelAndView();
        System.out.println("身份证" + id + "学号：" + num + "姓名：" + name + "年龄：" + age + "性别：" + sex);

//        创建一个没有id的学生类
        stuDent stuDent = new stuDent(id, num, name, age, sex);

        //        使用ArrayList实现
        ArrayList stuDents = ArrayListImpl.getArrayList();
//        使用LinkedList实现
//        LinkedList stuDents = LinkedListImpl.getLinkedList();
        stuDents.add(stuDent);

//        参数给前端
        mv.addObject("stuDents", stuDents);
//        指定视图
        mv.setViewName("show");
//        返回mv
        return mv;
    }

    @RequestMapping(value = "other.do", method = RequestMethod.POST)
    public ModelAndView doother(HttpServletRequest request, stuDent stuDent) {
        ModelAndView mv = new ModelAndView();

        System.out.println(stuDent);
//        添加数据
        mv.addObject("--", stuDent);

//        指定视图
        mv.setViewName("other");

//        获取访问者ip
        System.out.println(Ip.getIpAddress(request));

//        返回mv
        return mv;
    }

    @RequestMapping(value = "ajax.do")
    @ResponseBody
    public stuDent doajax(HttpServletRequest request,
                          HttpServletResponse response,
                          String name,
                          Integer age) {
        System.out.println("name:" + name + "age:" + age);
        ModelAndView mv = new ModelAndView();
        stuDent stuDent = new stuDent(10, name, age, "男");

//        获取访问者ip
        System.out.println(Ip.getIpAddress(request));

        return stuDent;
    }
}
