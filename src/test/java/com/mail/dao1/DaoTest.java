package com.mail.dao1;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mail.dao.SystemParamMapper;
import com.mail.pojo.SystemParam;

public class DaoTest extends TestBase {

    @Autowired
    private SystemParamMapper systemParamMapper;

    //@Ignore
    @Test
    public void testDao(){
    	SystemParam record = new SystemParam();
    	record.setpKey("COMMON_STATUS_20");
    	record.setpType("STATUS");
    	record.setpValue("未激活");
    	record.setpValueNumber(20);
    	record.setCreateBy("ADMIN");
    	record.setLastUpdateBy("ADMIN");
    	record.setCreateDate(new Date());
    	record.setLastUpdateDate(new Date());
    	systemParamMapper.insert(record);
    }


}
