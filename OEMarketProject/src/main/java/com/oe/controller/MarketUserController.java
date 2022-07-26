package com.oe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oe.domain.MarketUserVO;
import com.oe.service.MarketUserService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/user/*")
@AllArgsConstructor
public class MarketUserController {
	
	private MarketUserService userService;
	
	@GetMapping("join")
	public void joinUser() {}
	@PostMapping("join")
	public void joinUser(MarketUserVO vo) {
		log.info("vo : " + vo);
		userService.register(vo);
		userService.MyRegister(vo);
	}
	
	@GetMapping({"get","update"})
	public void getUser(String us_id, Model model) {
		log.info("getUser : " + us_id);
		model.addAttribute("user", userService.get(us_id));  
		
	}
	
	@PostMapping("update")
	public void updateUser(MarketUserVO vo) {
		log.info("update vo : " + vo);
		userService.modify(vo);
	}
	
	
	@GetMapping("findId")
	public String findId() {
		return "user/findId";
	}
	@PostMapping("findId")
	public void findId(MarketUserVO vo) {
		userService.findId(vo);
	}

	
	@GetMapping("findPass")
	public String findPass() {
		return "user/findPass";
	}
	
	@PostMapping("findPass")
	public void findPass(MarketUserVO vo) {
		userService.findPass(vo);
	}
}//
