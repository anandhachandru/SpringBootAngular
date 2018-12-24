package com.ck.alpha.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ck.alpha.bean.JsonResponse;
import com.ck.alpha.bean.User;
import com.ck.alpha.business.service.LoginService;
import com.ck.alpha.util.enums.MessageTypeEnum;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@GetMapping("/greeting")
	@ResponseBody
	public JsonResponse greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
		
		return new JsonResponse("Welcome " + name + "!.Greeting from Dev Team", MessageTypeEnum.SUCCESS.getValue(), "Success", "Service Running Successfully", true);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public JsonResponse showPage() {
		System.out.println("-----------Alpha----------");
		return new JsonResponse("Welcome Alpha", MessageTypeEnum.SUCCESS.getValue(), "Success", "Service Running Successfully", true);
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public JsonResponse signUpPage(@RequestBody User user) {
		System.out.println("-----------SingnUp----------");
		return loginService.login(user);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public JsonResponse login(@RequestBody User user) {
		System.out.println("-----------login----------");
		return loginService.login(user);
	}

}
