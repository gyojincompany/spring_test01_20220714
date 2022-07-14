package com.gyojincompany.test0714;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginOk(HttpServletRequest request, Model model) {
		
		String memberId = request.getParameter("id");
		String memberPw = request.getParameter("pw");
		model.addAttribute("memberId", memberId);
		if(memberId.equals("tiger")&&(memberPw.equals("12345"))) {
					
			return "loginOk";
		}
		
		return "loginNg";
	}
}
