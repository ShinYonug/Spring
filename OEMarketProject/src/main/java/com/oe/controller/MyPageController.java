package com.oe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oe.domain.MyPageVO;
import com.oe.service.MyPageService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/mypage/*")
public class MyPageController {
	private MyPageService service;
	
	@GetMapping({"/mypage", "/withdrawal"})
	public void get(String my_id, Model model) {
		log.info("mypage or withdrawal");
		model.addAttribute("mypage", service.get(my_id));
		model.addAttribute("user", service.checkPass(my_id));
		log.info(my_id);
	}
	
	@PostMapping("/profileEdit")
	public String profileEdit(MyPageVO vo, RedirectAttributes rttr) {
		log.info("profileEdit : " + vo);
		service.profileEdit(vo);
		rttr.addAttribute("my_id", vo.getMy_id());
		rttr.addFlashAttribute("result", "success");
		return "redirect:/mypage/mypage";
	}
	
	@PostMapping("/withdrawal")
	public String withdrawal(String my_id, RedirectAttributes rttr) {
		log.info("withdrawal id : " + my_id);
		service.withdrawal(my_id);
		rttr.addFlashAttribute("result", "success");
		return "redirect:/login.do";
	}
}
