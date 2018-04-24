package com.paymoon.defaulable.java8;

import java.util.function.Supplier;

interface DefaulableFactory {  
   // Interfaces now allow static methods  
   static Defaulable create(Supplier< Defaulable > supplier ) {  
       return supplier.get();  
   }  
}  