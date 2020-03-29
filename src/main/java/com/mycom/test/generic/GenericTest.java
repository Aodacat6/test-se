package com.mycom.test.generic;

import com.mycom.test.entity.Teacher;
import lombok.val;

import java.util.List;
import java.util.Objects;

/**
 * @author ：songdalin
 * @date ：Created in 2020-03-28 下午 12:08
 * @description：泛型测试
 * @modified By：
 * @version:
 */
public class GenericTest {

    /**
     * 测试泛型T
     * @param list1
     * @param list2
     * @param <T>
     * @return
     */
    public static <T> List<T> bondList(List<T> list1, List<T> list2){
        if (Objects.isNull(list1) && Objects.isNull(list2)){
            throw new RuntimeException("两个参数不能都为空！");
        }
        if (Objects.isNull(list1)){
            return list2;
        }
        //list1.addAll(list2) == true ? list1 : list1
        list1.addAll(list2);
        return list1;
    }

    /**
     * 测试泛型?, ?通配符放在list上，不能增加，只能修改删除
     * @param list1
     * @param list2
     * @param <?>
     * @return
     */
    public static  List<?> testBondList(List<?>  list1, Object val){

        list1.remove(val);
        return list1;
    }

}
