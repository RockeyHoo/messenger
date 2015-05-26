package com.github.rockeyhoo.rpc.simple;

import com.github.rockeyhoo.rpc.client.RpcProxy;
import com.github.roockey.rpc.sieve.modules.simple.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-client.xml")
public class HelloServiceTest {

	@Autowired
    private RpcProxy rpcProxy;
 
    @Test
    public void helloTest() {
        try {
			HelloService helloService = rpcProxy.create(HelloService.class);
			String result = helloService.hello("World");
			Assert.assertEquals("Hello! World", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
