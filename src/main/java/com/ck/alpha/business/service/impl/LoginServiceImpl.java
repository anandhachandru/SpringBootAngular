package com.ck.alpha.business.service.impl;

import org.springframework.stereotype.Service;

import com.ck.alpha.bean.JsonResponse;
import com.ck.alpha.bean.User;
import com.ck.alpha.business.service.LoginService;
import com.ck.alpha.util.enums.MessageTypeEnum;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public JsonResponse login(User user) {
		try {
			if (user != null) {
				if ("Alpha".equalsIgnoreCase(user.getUserName()) && "ck0011".equalsIgnoreCase(user.getPassWord())) {
					return new JsonResponse("Welcome " + user.getUserName() + "!", MessageTypeEnum.SUCCESS.getValue(),
							"Success", "Login Successfully", true);
				}
			}
		} catch (Exception ex) {
			System.out.println("Error Msg :" + ex.getMessage());
		}
		return new JsonResponse("UserName or Password Invalid", MessageTypeEnum.ERROR.getValue(), "Error",
				"Login faild", false);
	}

}
