package com.cn.hnst.dao;

import com.cn.hnst.pojo.User;

public interface IUserDao {
	public User selectByPrimaryKeys(int userId);  

}
