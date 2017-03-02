package com.zhao.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhao.pojo.User;
import com.zhao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("/list")
	public String UserList(Model model) {
		
		List<User> list =userService.findAll();
		model.addAttribute("list",list);
		return  "itemsList";
	}
	@RequestMapping("/edit")
	public String Edit(Integer iduser,Model model)
	{
		User user=userService.findById(iduser);
		model.addAttribute("item",user);
		return "editItem";
	}
	@RequestMapping(value ="/saveOrUpdate",method = RequestMethod.POST)
	public String saveOrUpdate(User user)
	{
		
		userService.update(user);
		return "redirect:list";
	}
	@RequestMapping("/deleteByID")
	public String deleteByID(Integer iduser)
	{
		
		userService.deleteById(iduser);
		return "redirect:list";
	}
	//超链接到对应的页面
	@RequestMapping("/add")
	public String Add()
	{
		return "AddUser";
	}
	//
	@RequestMapping("/addUser")
	public String Insert(User user)
	{
		userService.insert(user);
		return "redirect:list";
	}
}
