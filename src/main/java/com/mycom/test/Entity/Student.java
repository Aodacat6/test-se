package com.mycom.test.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
