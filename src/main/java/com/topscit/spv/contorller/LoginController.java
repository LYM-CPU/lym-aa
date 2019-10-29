package com.topscit.spv.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/testlogin")
	public String test()
	{
		System.out.println("ÓÃ»§µÇÂ½¹ý");
		return "";
	}

}
