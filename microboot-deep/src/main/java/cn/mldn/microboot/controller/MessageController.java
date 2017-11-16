package cn.mldn.microboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.microboot.service.IMessageService;

@Controller
public class MessageController {
	@Resource
	private IMessageService messageService ; 
	@RequestMapping("/show")
	public String show(Model model) { //传递参数
		model.addAttribute("msg",this.messageService.echo()) ; 
		return "message/message_show" ; 
	}
}
