package com.spring.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;

@RestController
public class SessionController {
	@GetMapping("/set/{username}/{password}")
	public String setSession(@PathVariable String username, @PathVariable String password, HttpSession session) {
		String id = UUID.randomUUID().toString().replace("-", "");
		password = DigestUtils.md5DigestAsHex(password.getBytes());
		session.setAttribute("user", new User(id, username, password));
		return "添加session成功";
	}

	@GetMapping("/get/{session_key}")
	public User getSession(@PathVariable String session_key, HttpSession session) {
		User user=  (User) session.getAttribute(session_key);
		System.out.println(user);
		return user;
	}
}
