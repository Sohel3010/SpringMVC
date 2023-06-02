package com.tw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//@RequestMapping(value="/hi" ,method=RequestMethod.GET)
	@GetMapping("/")
	public String sayHello() {
		return "hello";
	}
}
