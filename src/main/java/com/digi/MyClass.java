package com.digi;

import java.util.Date;

public class MyClass {
    String name;
    private final Date date;

    public MyClass(String name, Date date) {
        this.name = name;
        this.date = new Date(date.getTime());
    }

    public Date getMyDate() {
        return new Date(date.getTime());
    }
    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
