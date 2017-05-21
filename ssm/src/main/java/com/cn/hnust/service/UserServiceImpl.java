package com.cn.hnust.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnst.dao.IUserDao;
import com.cn.hnst.pojo.User;

@Service("userService")  
public class UserServiceImpl implements IUserService  {

	@Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return userDao.selectByPrimaryKeys(userId);  
    }  
  
	
}
