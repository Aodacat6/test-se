package com.mycom.test.lambda.data;

/**
 * @author ：songdalin
 * @date ：2020-04-12 下午 05:54
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Person {

    private String name;

    private int age;

    public Person(){
        System.out.println("这是无参数构造方法");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("这是有参构造方法" + this.toString());
    }

    @Override
    public String toString(){

        return "name:" + this.name +  "age:" + this.age;
    }
}
