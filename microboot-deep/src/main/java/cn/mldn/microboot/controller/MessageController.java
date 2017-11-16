package cn.mldn.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	@RequestMapping("/echo")
	@ResponseBody
	public String echo(String msg) {
		return "【ECHO返回】" + msg ;
 	}
}
