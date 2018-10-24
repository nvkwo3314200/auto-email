package com.mail.service;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.mail.TestBase;
import com.mail.common.ResponseService;
import com.mail.pojo.SystemParam;

public class ISystemParamTest extends TestBase{
	
	@Autowired
	ISystemParamService iSystemService;
	
	@Test
	public void getPage() {
		SystemParam sp = new SystemParam();
		//sp.setId(1);
		sp.setpType("STATUS");;
		System.out.println(iSystemService.getPage(sp, 1, 10));
	}
	
	@Test
	@Transactional
	public void insert() throws JsonGenerationException, JsonMappingException, IOException {
		SystemParam record = new SystemParam(null, "STATUS", "COMMON_STATUS_40", "哈 哈", null, null, null, new Date(), null, "admin", new Date(), "admin", 1);
		iSystemService.insert(record);
		ResponseService<PageInfo<SystemParam>> PageInfo = iSystemService.getPage(record, 1, 10);
		logger.info(PageInfo.toString());
	}
}
