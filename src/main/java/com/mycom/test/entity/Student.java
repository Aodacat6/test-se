package com.mycom.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：Created in 2020-03-28 下午 12:13
 * @description：
 * @modified By：99
 * @version:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Teacher {

    private String name;

    private String sex;

    private int age;

    private List<Teacher> listOfTeachers;
}
