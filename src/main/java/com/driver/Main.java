package com.driver;


public class Main {
    public static void main(String[] args) {
        RWOnly  info=new RWOnly();
        // info.name;//it is private member and have read only access
        info.setName("satyam");
        // String ans=
        System.out.print( info.getName());




    }



}