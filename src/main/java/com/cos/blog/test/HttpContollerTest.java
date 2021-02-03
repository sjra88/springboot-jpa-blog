package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML파일)
// @Controller

// 사용자가 요청 -> 응답(DATA)
@RestController

public class HttpContollerTest {
	// 인터넷 브라우저 테스트는 get밖에 할 수 없다
	// http://localhost:8080/http/get
	@GetMapping("/http/get")
	// Query String을 개별로 받을 때, 
	/*
	 * public String getTest(@RequestParam int id, @RequestParam String username) {
	 * return "get 요청: "+ id+", "+username; 
	 * }
	 */
	
	// Query String을 모두 받을 때
	public String getTest(Member m) {
		return "get 요청: "+ m.getId()+", "+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}

	@PostMapping("/http/post")
	/*
	 * POSTMAN에서 body에서 form형태로 전송
	 * public String postTest(Member m) { { // MessageConverter(스프링부트)
	 * return "post 요청: "+m.getId()+", "+m.getUsername()+","+m.getPassword()+","+m.getEmail(); }
	 */
	/*
	 * POASTMAN에서 TEXT로 전송 - text/plain
	 * public String postTest(String text) { return "post 요청: "+text; }
	 */	 
	
	/* 
	 * POSTMAN에서 JSON으로 전송 - application/json
	 */
	public String postTest(@RequestBody Member m) { // MessageConverter(스프링부트)
		return "post 요청: "+m.getId()+", "+m.getUsername()+","+m.getPassword()+","+m.getEmail(); 
	}
	
	
	@PutMapping("/http/put")
	/*
	 * public String putTest() { return "put 요청"; }
	 */
	/* 
	 * POSTMAN에서 JSON으로 전송 - application/json
	 */
	public String putTest(@RequestBody Member m) {
		return "put 요청: "+m.getId()+", "+m.getUsername()+","+m.getPassword()+","+m.getEmail(); 	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}

}
