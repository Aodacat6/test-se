package com.mycom.test.lambda;

import com.mycom.test.lambda.interfacetest.LambdaMultArgHaveReturn;
import com.mycom.test.lambda.interfacetest.LambdaNoArgNoReturn;
import com.mycom.test.lambda.interfacetest.LambdaOneArgHaveReturn;
import com.mycom.test.lambda.interfacetest.LambdaOneArgNoReturn;

/**
 * @author ：songdalin
 * @date ：2020-04-12 上午 11:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class LamInterfaceTest {
    public static void main(String[] args){
        //lambda表达式基础语法
        //lambda是一中匿名函数
        //需要 参数列表、方法体

        //() 参数列表
        //{} 方法体
        //-> lam运算符 ，读作 goes to

        //实例一
/*        LambdaNoArgNoReturn lam1 = () -> {
            System.out.println("test one");
        };
        lam1.add();*/

        //实例二
/*        LambdaOneArgNoReturn lam2 = (int a) -> {
            System.out.println(a);
        };
        lam2.add(4);*/
  /*      LambdaOneArgNoReturn lam2 =  a -> System.out.println(a);
        lam2.add(4);*/
        //实例三
        LambdaMultArgHaveReturn lam3 = (int a, int b) -> {
            return a * b;
        };
        System.out.println(lam3.add(10, 3));

        /**
         * =====================================================================================
         * */
        //lambda表达式精简
        //1、参数列表参数类型可以省略
        //2、只有一个参数时，小括号可以省略
        //3、方法体只有一句话时，可以省略花括号
        //4、方法体只有一句话并且是返回值return时，省略花括号必须省略return

        //实例四精简版
        LambdaMultArgHaveReturn lam4 = (a, b) -> a * b;

        System.out.println(lam4.add(10, 3));
    }
}
