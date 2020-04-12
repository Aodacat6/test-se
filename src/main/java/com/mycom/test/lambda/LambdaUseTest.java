package com.mycom.test.lambda;

import com.mycom.test.lambda.interfacetest.LambdaMultArgHaveReturn;

/**
 * @author ：songdalin
 * @date ：2020-04-12 下午 05:35
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class LambdaUseTest {

    public static void main(String[] args){

        //lambda函数调用的两种方法
        //1、（） -> 方法名(参数)
        //2、 用 :: 调用符号， 对象隶属者 :: 方法名， 成员函数的隶属者是对象，静态函数的隶属者是类。

        LambdaMultArgHaveReturn lam1 = (a, b) -> change(a, b);

        LambdaMultArgHaveReturn lam2 = LambdaUseTest :: change;
        System.out.println(lam2.add(1, 9));
    }

    //为了减少每次lambda都要写方法体，所以把方法体拿出来封装成一个函数
    //这样所有的调用都直接调用这个函数就行了
    private static int change(int a, int b){
        return a * b;
    }
}
