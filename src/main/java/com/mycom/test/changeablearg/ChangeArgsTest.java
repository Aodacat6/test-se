package com.mycom.test.changeablearg;

/**
 * @author ：songdalin
 * @date ：2020-04-19 下午 12:05
 * @description： 可变参数测试
 * @modified By：
 * @version: 1.0
 */
public class ChangeArgsTest {

    public static void main(String[] args){
        add(1, 2, 3, 4, null);
    }

    @Deprecated
    private static int add(Integer...j){
        for (int i : j){
            System.out.println(i);

        }
        return 0;
    }
}
