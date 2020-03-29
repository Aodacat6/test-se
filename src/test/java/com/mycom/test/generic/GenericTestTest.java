package com.mycom.test.generic;

import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ：songdalin
 * @date ：Created in 2020-03-29 上午 11:17
 * @description：
 * @modified By：
 * @version:
 */
public class GenericTestTest {

    @Test
    public void bondList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<String> list2 = new ArrayList<>();
        list2.add("xiaoming");
        list2.add("damiao");
        List<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        //这样是错误的
        //GenericTest.bondList(list1, list2);
/*        GenericTest.bondList(list2, list3);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        Iterator iterator3 = list3.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }*/
        List<String> list4 = new ArrayList<>();
        List calcList = GenericTest.bondList(list4, list2);
        Iterator iterator2 = calcList.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}