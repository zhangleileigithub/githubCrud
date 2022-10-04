package com.gongsi.githubcrud.service;

import com.gongsi.githubcrud.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 张雷雷
 * 2022/10/4
 */

public interface UserServic {
    //查
    User find(Integer id);//数据库自增使用Integer数值类型
    List<User> select(User user);//根据条件查询用户列表
    //删
    boolean delete(Integer id);
    //增
    boolean insert(User user);
    //改
    boolean update(User user);
    //批量删除
    int deleteByIds(List<Integer> ids);
    //批量增加
    boolean insertBatch(List<User> list);
    //插入数据返回id
    void insertResultId(User user);
}
