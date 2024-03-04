package com.digi;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hello", new Date());

        System.out.println(myClass.name + " :: " + myClass.getMyDate());

        myClass.name.toUpperCase();
        myClass.getMyDate().setTime(myClass.getMyDate().getTime() + TimeUnit.SECONDS.toMillis(300));

        System.out.println(myClass.name + " :: " + myClass.getMyDate());
    }
}


