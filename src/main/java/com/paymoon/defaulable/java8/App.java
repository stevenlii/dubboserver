package com.paymoon.defaulable.java8;

/**
 *Java 8 新特性：接口的静态方法和默认方法 - CSDN博客
https://blog.csdn.net/sun_promise/article/details/51220518
 */
public class App {
	public static void main(String[] args) {
		Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.myDefalutMethod());
		Defaulable defaulable2 = new DefaultableImpl();
		System.out.println(defaulable2.myDefalutMethod());

		defaulable = DefaulableFactory.create(OverridableImpl::new);
		System.out.println(defaulable.myDefalutMethod());
	}
}
