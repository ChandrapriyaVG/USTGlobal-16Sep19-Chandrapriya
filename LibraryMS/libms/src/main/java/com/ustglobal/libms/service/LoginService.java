package com.ustglobal.libms.service;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Users;

public interface LoginService {

	public Users login(Users users) throws CustomException ;
}
