package com.mail.dao;

import java.util.List;

import com.mail.pojo.SystemParam;

public interface SystemParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemParam record);

    int insertSelective(SystemParam record);

    SystemParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemParam record);

    int updateByPrimaryKey(SystemParam record);
    
    List<SystemParam> selectByCriteria(SystemParam record);
}