package com.gongsi.githubcrud.service.impl;

import com.gongsi.githubcrud.mapper.UserMapper;
import com.gongsi.githubcrud.pojo.User;
import com.gongsi.githubcrud.service.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 张雷雷
 * 2022/10/4
 */
@Service
public class UserServiceImpl implements UserServic {
    @Autowired
    UserMapper userMapper;

    public User find(Integer id) {
        User user = userMapper.find(id);
        return user;
    }
    //条件查询多个用户
    public List<User> select(User user) {
        List<User> list = userMapper.select(user);
        return list;
    }
    
    public boolean delete(Integer id) {
        boolean result = userMapper.delete(id);
        return result;
    }
    //插入数据
    public boolean insert(User user) {
        boolean result = userMapper.insert(user);
        return result;
    }
    
    public boolean update(User user) {
        boolean result = userMapper.update(user);
        return result;
    }
    //批量删除
    public int deleteByIds(List<Integer> ids) {
        int state = userMapper.deleteByIds(ids);
        return state;
    }
    //批量添加
    public boolean insertBatch(List<User> list) {
        boolean result = userMapper.insertBatch(list);
        return result;
    }
    //插入数据返回id
    public void insertResultId(User user) {
        userMapper.insertResultId(user);
        System.out.println(user.getId());
    }



}
