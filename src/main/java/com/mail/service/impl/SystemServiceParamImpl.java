package com.mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mail.common.ResponseService;
import com.mail.dao.SystemParamMapper;
import com.mail.pojo.SystemParam;
import com.mail.service.ISystemParamService;

@Service("iSystemService")
public class SystemServiceParamImpl implements ISystemParamService {
	
	@Autowired
	SystemParamMapper systemParamMapper;

	@Override
	public ResponseService<String> insert(SystemParam systemParam) {
		systemParamMapper.insertSelective(systemParam);
		return ResponseService.createSuccessResponse("插入成功");
	}

	@Override
	public ResponseService<String> update(SystemParam t) {
		systemParamMapper.updateByPrimaryKey(t);
		return ResponseService.createSuccessResponse("更新成功");
	}

	@Override
	public ResponseService<String> delete(int id) {
		systemParamMapper.deleteByPrimaryKey(id);
		return ResponseService.createSuccessResponse("删除成功");
	}


	@Override
	public ResponseService<PageInfo<SystemParam>> getPage(SystemParam record, int pageNum, int pageSize) {
		PageInfo<SystemParam> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> systemParamMapper.selectByCriteria(record)); 
		return ResponseService.createSuccessResponse(pageInfo);
	}

	
	
	
}
