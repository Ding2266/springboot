package cn.mldn.microboot.base.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.base.bootStart;
import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration  //现在要使用一个WEB程序启动
@SpringBootTest(classes = bootStart.class)  //定义要测试的程序类
public class bootStartTest {
	@Resource
	private bootStart bootstart ; 
	@Test
	public void testHome() {
		String str = this.bootstart.home() ;  
		System.err.println("bootstart.home()返回结果：" + str);
		TestCase.assertEquals(str, "Hello World!");
	}
}
