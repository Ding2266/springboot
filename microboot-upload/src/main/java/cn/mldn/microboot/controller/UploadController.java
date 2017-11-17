package cn.mldn.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	@RequestMapping("/upload_pre")
	public String show(Model model) {
		return "back/upload/upload" ; 
	}
	@RequestMapping(path = "/upload",method = RequestMethod.POST)
	public Object list(MultipartFile photo) { //上传
		if(photo != null) { //现在有上传文件
			System.err.println("原始文件名称：" + photo.getOriginalFilename());
			System.err.println("文件的类型：" + photo.getContentType()) ;
			System.err.println("文件大小：" + photo.getSize());
		}
		return "upload-finish" ; 
	}
}
