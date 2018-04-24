package com.paymoon.defaulable.java8;
class OverridableImpl implements Defaulable {  
        //OverridableImpl实现了Defaulable接口重写接口的默认实现，提供了自己的实现方法。  
        @Override  
        public String myDefalutMethod() {  
            return "Overridden implementation";  
        }  
} 