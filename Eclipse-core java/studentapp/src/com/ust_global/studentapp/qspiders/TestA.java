package com.ust_global.studentapp.qspiders;

import com.ust_global.studentapp.jspiders.*;


public class TestA {
	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.teachQtp();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
//		com.ust_global.studentapp.jspiders.Angular a = new com.ust_global.studentapp.jspiders.Angular();
//		com.ust_global.studentapp.jspiders.Angular a1 = new com.ust_global.studentapp.jspiders.Angular();
//	
		Angular a = new Angular();
		a.teachAngular();
		React r = new React();
		r.teachReact();
		}

		
	
}
