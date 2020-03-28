package com.mycom.test.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：Created in 2020-03-28 下午 12:09
 * @description：
 * @modified By：
 * @version:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private String name;

    private String sex;

    private int age;

    private List<Student> lists;
}
