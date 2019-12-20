package com.example.demo_a.controller;

import com.example.demo_a.obj.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UsersController {
    static Map<Long, User> list = new HashMap<>();
    static{
        list.put(1l,new User(1l,"devin","15","杭州","浙江大学"));
        list.put(2l,new User(2l,"Jack","15","上海","复旦大学"));
        list.put(3l,new User(3l,"Lily","15","NewYork","哥伦比亚大学"));
        list.put(4l,new User(4l,"Rose","15","厦门","中山大学"));
    }
    @ApiOperation(value = "获取用户列表",notes = "根据用户id")
    @ApiImplicitParam(name = "id",value = "用户id",required = true)
    @RequestMapping(value="/show/{id}")
    public User getUserById(@PathVariable Long id){
        if(id!=null){
            return list.get(id);
        }
        return null;
    }
    @ApiOperation(value = "删除用户信息",notes = "根据用户id")
    @ApiImplicitParam(name = "id",value = "用户id",required = true)
    @RequestMapping(value="/del/{id}")
    public String deleteUserById(@PathVariable Long id){
        String message = "用户不存在，删除失败";
        if(id!=null){
            User user = list.get(id);
            if(user!=null){
                list.remove(user);
                message = "删除成功！";
            }
        }
        return message;
    }
    @ApiOperation(value = "插入用户信息",notes = "根据用户obj")
    @ApiImplicitParam(name = "user",value = "用户对象",required = true)
    @RequestMapping(value="/insert")
    public String insertUser(@RequestBody User user){
        String message = "信息不全 插入用户信息错误";
        if(user!=null && user.getId()!=null ){
            if(list.get(user.getId())==null){
                list.put(user.getId(),user);
                message = "success";
            }else {
                message = "用户信息已经存在";
            }
        }
        return message;
    }
}
