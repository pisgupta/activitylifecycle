package com.sfs.bean;

import java.io.Serializable;

/**
 * Created by Pankaj on 7/16/2015.
 * http://www.javacodegeeks.com/2014/01/android-tutorial-two-methods-of-passing-object-by-intent-serializableparcelable.html
 */
public class Employee implements Serializable {
    public String name;
    public int age;
    transient String add;
    public Employee(){
        name="pankaj";
        age=12;
        add="Mohali";
    }
}
