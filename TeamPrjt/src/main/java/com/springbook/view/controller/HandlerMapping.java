package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.user.LoginController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
		public HandlerMapping() {
			mappings = new HashMap<String, Controller>();
			mappings.put("/login.do", new LoginController());
		}
		
		//map<키, 값> a.put(키, 값)  -- 넣을때 키값 넣고      a.get(키)=>값     -- 뺄때 키 넣으면 값이 나옴
		public Controller getController(String path) {
			return mappings.get(path);
		}
}
