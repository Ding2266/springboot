package cn.mldn.microboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.microboot.dao.IDeptDAO;
import cn.mldn.microboot.service.IDeptService;
import cn.mldn.microboot.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO ; 
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}