package com.ck.alpha.business.service;

import com.ck.alpha.bean.JsonResponse;
import com.ck.alpha.bean.User;

public interface LoginService {
	
	public JsonResponse login(User user);

}
