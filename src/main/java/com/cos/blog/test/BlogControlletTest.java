package com.cos.blog.test;

import javax.swing.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 con.cos.blog 패키지 이하를 스캔해서 모든파일을 메모리에 new하는 것이 아니라, 
//특정 어노테이션이 붙어 있는 클래스 파일들을 new해서(IOC) 스프링 컨테이너에 관리해줍니다.
@RestController 

public class BlogControlletTest {
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring boot1</h1>";
	}
}
