package com.mor.main;  
import java.io.IOException;  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
/** 
 * 服务器的执行入口 
 * @author zx 
 * @date 2015年8月17日 下午3:17:33 
 */  
public class Main {  
      
    public static void main(String[] args) throws IOException {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });  
        context.start();  
        System.out.println("按任意键退出");  
        System.in.read();  
    }  
  
} 