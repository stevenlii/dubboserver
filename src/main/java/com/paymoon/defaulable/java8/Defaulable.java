package com.paymoon.defaulable.java8;
interface Defaulable {  
    //使用default关键字声明了一个默认方法  
     default String myDefalutMethod() {  
        return "Default implementation";  
    }  
} 