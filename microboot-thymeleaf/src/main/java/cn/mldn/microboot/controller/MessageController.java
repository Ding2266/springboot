package cn.mldn.microboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	@RequestMapping("/message")
	public String message(Model model,HttpServletRequest request) {
		model.addAttribute("title","<span style='color:red'>明天放假</span>") ; 
		request.setAttribute("msg", "放假");
		return "message/message_show" ; 
	}
}
