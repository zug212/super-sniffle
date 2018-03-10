package test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/springmvc.xml")
public class HelloServiceTest {
	
	@Resource
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		String res = helloService.sayHello("world");
		System.out.println(res);
		assertTrue(true);
	}
}
