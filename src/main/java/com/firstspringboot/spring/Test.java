package com.firstspringboot.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
//@ResponseBody
//public class Test 
//{
//	@RequestMapping("/test")
//	public String Testing()
//	{
//	return "Connected0----)ewkqw";
//	}
//
//}
@RestController
public class Test
{@GetMapping("/home/{id}")
	public String home(@PathVariable("id")int id)
	{
		return "Docker project"+id;
	}
}