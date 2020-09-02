package cn.adeerlongneck.dgserver.controller;


import cn.adeerlongneck.dgserver.entity.User;
import cn.adeerlongneck.dgserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by chao on 2020/4/2.
 */
 @RestController
public class Hello {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
  public List<User> getAllUser(){
   List<User> userList = userService.selectAll();
   return  userList;
  }

}
