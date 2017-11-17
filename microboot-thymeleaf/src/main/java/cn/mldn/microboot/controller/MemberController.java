package cn.mldn.microboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.microboot.vo.Member;

@Controller
public class MemberController {
	@RequestMapping("/member_show")
	public String show(Model model) {
		Member vo = new Member() ; 
		vo.setMid("dj");
		vo.setName("ding");
		vo.setDeptno(10L);
		vo.setAge(10);
		vo.setSalary(500.21);
		vo.setBirthday(new Date());
		model.addAttribute("member", vo) ; 
		return "back/member/member_show" ; 
	}
}
