package com.paymoon.defaulable.java8.v2;

import java.util.function.Supplier;


/**
 * @author paymoon.com
 *https://my.oschina.net/u/576554/blog/535010
 */
public class SupplierTest {
	public static String supplierTest(Supplier<String> supplier) {  
	        return supplier.get();  
	    }  
	
	    public static void main(String args[]) {
	        String name = "冷冷";
	        System.out.println(supplierTest(() -> name.length() + ""));
	        System.out.println(supplierTest(() -> name + ""));
	       String ssString = supplierTest(String::new);
	        System.out.println(ssString);
	    }
}

