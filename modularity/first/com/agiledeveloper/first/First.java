package com.agiledeveloper.first;

public class First {
    public String getInfo(){
        return "first " + getClass().getModule();
    }

    public static void main(String[] args){
        System.out.println("hello");
    }
}