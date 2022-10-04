package com.gongsi.githubcrud.conroller;

import com.gongsi.githubcrud.pojo.User;
import com.gongsi.githubcrud.service.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 张雷雷
 * 2022/10/4
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServic userServic;
    //根据id查询信息
    @RequestMapping("/findById")
    @ResponseBody
    public User find(Integer id){
        User user = userServic.find(id);
        return user;
    }
    //根据条件查询用户列表
    @RequestMapping("/select")
    @ResponseBody
    public List select(User user){
         List list = userServic.select(user);
         System.out.println(list.toString());
         return list;
    }

    @RequestMapping("/delete")
    public void select(Integer id){
        boolean result = userServic.delete(id);
        System.out.println(result);
    }
    @RequestMapping("/insert")
    public void insert(User user) {
        boolean result = userServic.insert(user);
        System.out.println(result);
    }
    @RequestMapping("/update")
    public void update(User user) {
        boolean result = userServic.update(user);
        System.out.println(result);
    }
    @RequestMapping("/deleteByIds")
    public void deleteByIds(List<Integer> ids) {
        int state = userServic.deleteByIds(ids);
        System.out.println(state);
    }
    @RequestMapping("/insertBatch")
    public void insertBatch(@RequestBody List<User> list) {
        boolean result = userServic.insertBatch(list);
        System.out.println(result);;
    }
    @RequestMapping("/insertResultId")
    @ResponseBody
    public User insertResultId(User user) {
        userServic.insertResultId(user);
        System.out.println(user.getId());;
        return user;
    }
}
