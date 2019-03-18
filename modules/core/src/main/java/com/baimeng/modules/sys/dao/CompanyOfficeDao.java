/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.baimeng.modules.sys.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.datasource.DataSourceHolder;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.baimeng.modules.sys.entity.CompanyOffice;
import com.baimeng.modules.sys.entity.CompanyOffice;

/**
 * 公司机构DAO接口
 * @author ThinkGem
 * @version 2017-03-23
 */
@MyBatisDao(dataSourceName=DataSourceHolder.DEFAULT)
public interface CompanyOfficeDao extends CrudDao<CompanyOffice> {
	
}