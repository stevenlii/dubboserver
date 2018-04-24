package com.paymoon.defaulable.java8.v2;

import java.util.function.Consumer;

@FunctionalInterface    
    public interface CustomLamda<T> {
    
    	T testCustomFunction(Consumer<T> cunsumer);
    	
    	/*如果把下面方法的注释放开, 那么接口就报错了. 验证了前面所说的:@FunctionalInterface注解的接口只允许         *有一个抽象方法
    	 */
        //T anErrorMethod();
    }