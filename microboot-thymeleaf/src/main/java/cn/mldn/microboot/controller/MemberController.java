package cn.mldn.microboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<Long,String> deptMap = new HashMap<Long,String>() ; 
		deptMap.put(10L, "财务部") ; 
		deptMap.put(20L, "销售部") ; 
		model.addAttribute("allDepts",deptMap) ; 
		model.addAttribute("member", vo) ; 
		return "back/member/member_show" ; 
	}
	@RequestMapping("/member_list")
	public Object list(Model model) {
		Map<String,Member> allMembers = new HashMap<String,Member>() ; 
		for(int x=0 ; x<10 ; x++) {
			Member vo = new Member() ;
			vo.setMid("dj" + x);
			vo.setName("ding" + x);
			vo.setDeptno(10L);
			vo.setAge(10);
			vo.setSalary(500.21);
			vo.setBirthday(new Date());
			allMembers.put("vo-" + x, vo) ; 
		}
		model.addAttribute("allMembers", allMembers) ; 
		return "back/member/member_list" ; 
	}
}
