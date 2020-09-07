package com.fogcoding.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/9/7 20:29
 * @e-mail: thinfog@126.com
 */
@Controller
public class HiSourceCode {


	@RequestMapping("/hi")
	@ResponseBody
	public String method(){
	    System.out.println("HiSourceCode");
	    return "HiSourceCode";
	}

}
