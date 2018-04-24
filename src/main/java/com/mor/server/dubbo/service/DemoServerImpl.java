package com.mor.server.dubbo.service;

import java.util.Date;

/**
 * 服务端接口实现类
 * @author zx
 * @date 2015年8月17日 下午3:18:52
 */
public class DemoServerImpl implements DemoServer {

	public String sayHello(String str) {
		str = "Hello " + str + "  2:" + new Date();
		System.err.println("server:" + str);
		return str;
	}
}