package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {

	// http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("Temp");
		// 파일 리턴 기본경로: /src/main/resources/static
		//리턴명: /home.html <- not "home.html"
		return "/home.html";
	}
	@GetMapping("/temp/image")
	public String tempImage() {
		return "/a.png";
	}

	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// prefix: /WEB-INF/views/
		// suffix: .jsp
		// full path: /WEB-INF/views/[return value].jsp
		return "test";
		
	}

}
