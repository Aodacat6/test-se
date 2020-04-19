package com.mycom.test.overwriteequals;

import com.auth0.jwt.internal.org.apache.commons.lang3.StringUtils;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import lombok.ToString;

import java.io.PipedReader;
import java.util.Objects;

/**
 * @author ：songdalin
 * @date ：2020-04-19 下午 05:16
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Cat {

    private int age;

    private String name;

    public Cat(){

    }

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "age:" + this.age + "name:" + name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(object instanceof Cat){
            Cat catObj = (Cat) object;
            if (catObj.age == this.age && StringUtils.equals(this.name, catObj.name)){
                return true;
            }
        }
        return false;
    }
}
