package cn.mldn.microboot.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.mldn.microboot.service.IMessageService;

@RestController	//本类中的所有的返回都是Rest类型（省略了"@ResponseBody"）
public class MessageController {
	@Resource 
	private IMessageService messageService ; 
	@Resource
	private MessageSource messageSource ; 
	
	@RequestMapping("/msg")
	public String hello() {
		return this.messageService.echo() ; 
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return this.messageSource.getMessage("welcome.msg", new Object[] {"mldn"},Locale.getDefault()) ;  
	}
	@RequestMapping("/echo")
	@ResponseBody
	public String echo(String msg) {
		return "【ECHO返回】" + msg ;
 	}
	
	@RequestMapping("/inner1")
	@ResponseBody
	public Object innerObject1(HttpServletRequest request,HttpServletResponse response) {
		Map<String,String> map = new HashMap<String,String>() ; 
		map.put("request-contextPath", request.getContextPath()) ; 
		map.put("session-id", request.getSession().getId()) ; 
		map.put("application-realPath", request.getServletContext().getRealPath("/")) ; 
		map.put("response-contentType", response.getContentType()) ; 
		return map ; 
	}
	@RequestMapping("/inner2")
	@ResponseBody
	public Object innerObject2() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest() ; 
		HttpServletResponse response =((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse() ; 
		Map<String,String> map = new HashMap<String,String>() ; 
		map.put("request-contextPath", request.getContextPath()) ; 
		map.put("session-id", request.getSession().getId()) ; 
		map.put("application-realPath", request.getServletContext().getRealPath("/")) ; 
		map.put("response-contentType", response.getContentType()) ; 
		return map ; 
	}
}
