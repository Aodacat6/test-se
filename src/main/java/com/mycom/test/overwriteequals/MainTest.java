package com.mycom.test.overwriteequals;

/**
 * @author ：songdalin
 * @date ：2020-04-19 下午 05:17
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class MainTest {

    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("猫腻");

        Cat cat1 = new Cat();
        cat1.setAge(2);
        cat1.setName("猫腻");

        System.out.println(cat.equals(cat1));
    }
}
