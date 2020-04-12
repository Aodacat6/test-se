package com.mycom.test.lambda;

/**
 * @author ：songdalin
 * @date ：2020-04-12 上午 10:50
 * @description：  1、lambda是一种匿名内部类的实现，对接口的简单实现，需要注意，被实现的接口中只能有一个需要强制实现的
 *                  方法（default方法除外）
 *                  2、接口实现的三种方式
 *                    一：接口实现类
 *                    二：匿名内部类
 *                    三：lambda
 *                   3、lambda格式
 *                     接口名 接口 = （参数名）-> 实现过程
 * @modified By：
 * @version: 1.0
 */
public class LambdaTest {

    public static void main(String[] args){
        int result = 0;
        //方法一
       /* Compare compare = new CompareImpl();
        result = compare.add(1, 3);*/
       //方法二
/*        Compare compare = new Compare() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        result = compare.add(1, 3);*/
        //方法三
        Compare compare = (a, b) -> a + b;
        result = compare.add(1, 3);
        System.out.println(result);
    }
}

class CompareImpl implements Compare{

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

//@FunctionalInterface是对lambda格式接口的一种限制，即接口中只能有一个必须要实现的方法
@FunctionalInterface
interface Compare{
    int add (int a , int b);
    default int sub (int a, int b, int c){
        return 0;
    };
}
