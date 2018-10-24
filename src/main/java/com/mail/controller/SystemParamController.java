package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.mail.common.ResponseService;
import com.mail.pojo.SystemParam;
import com.mail.service.ISystemParamService;

@RestController
@RequestMapping("systemParam")
public class SystemParamController {
	
	@Autowired
	ISystemParamService iSystemParamService;  
	
	@RequestMapping(value="/list", method = RequestMethod.POST)
	public ResponseService<PageInfo<SystemParam>> list(@RequestBody SystemParam param, 
			@RequestParam(defaultValue = "1") int pageNum, 
			@RequestParam(defaultValue = "10") int pageSize) {
		return iSystemParamService.getPage(param, pageNum, pageSize);
	}
}
