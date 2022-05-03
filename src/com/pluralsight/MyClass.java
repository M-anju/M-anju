package com.pluralsight;

public class MyClass{
    String lable;
    String value;

    public MyClass(String lable, String value){
        this.lable=lable;
        this.value=value;
    }
    public boolean equals(Object o){
        MyClass ot =(MyClass) o;
        return value.equalsIgnoreCase(ot.value);
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
