package com.ustglobal.libms.dao;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Users;

public interface LoginDAO {

	public Users login(Users users) throws CustomException ;
}
