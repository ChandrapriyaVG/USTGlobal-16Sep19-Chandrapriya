package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

//9
//@ControllerAdvice 			//advice the controller(in springmvc) @ResponseBody needed
@RestControllerAdvice				//@ResponseBody not needed(for springrest)
public class HandleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Execution interrupted");
		response.setDescription("Exception in code");
		return response;
	}
}
