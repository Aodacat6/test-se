package com.mycom.test.lambda;

import com.mycom.test.lambda.data.Person;

/**
 * @author ：songdalin
 * @date ：2020-04-12 下午 05:59
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class LamConstructorUseTest {
    public static void main(String[] args){
        //lambda调用构造方法，适用于返回参数为对象的情况，并且构造方法的参数和接口的参数一致才行

  /*      PersonTest person = () -> {
            return new Person();
        };
        PersonTest personTest = () -> new Person();*/
        // 用 类名::new 调用类的构造方法，至于调用的是有无参数的构造方法，看的是接口中的参数定义
        PersonTest personTestNew = Person::new;
        Person person = personTestNew.getPerson();

        PersonAllConTest personAllConTest = Person::new;
        Person person1 = personAllConTest.getPerson("ming", 12);
    }


}
@FunctionalInterface
interface PersonTest{
    Person getPerson();
}
@FunctionalInterface
interface PersonAllConTest{
    Person getPerson(String name, int age);
}
