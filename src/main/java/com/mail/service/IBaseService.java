package com.mail.service;

import com.github.pagehelper.PageInfo;
import com.mail.common.ResponseService;

public interface IBaseService<T> {
	
	public ResponseService<String> insert(T record);
	
	public ResponseService<String> update(T record);
	
	public ResponseService<String> delete(int id);
	
	public ResponseService<PageInfo<T>> getPage(T record, int pageNum, int pageSize);
}
