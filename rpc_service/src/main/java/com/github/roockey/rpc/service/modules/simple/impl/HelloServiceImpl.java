package com.github.roockey.rpc.service.modules.simple.impl;

import com.github.roockey.rpc.service.core.RpcService;
import com.github.roockey.rpc.service.modules.simple.HelloService;

// 指定远程接口
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello! " + name;
	}

}
