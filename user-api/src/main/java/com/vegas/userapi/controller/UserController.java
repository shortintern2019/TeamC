package com.vegas.userapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.vegas.userapi.modeldto.User;
import com.vegas.userapi.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
 	private final UserService userService;
    @GetMapping("/sign_up")
    public String getSignUpPage(Model model) {
    	 model.addAttribute("user",new User());
        return "form";
    }
    @PostMapping("/index")
    public String completeSignUp(@ModelAttribute User user) {
    	userService.saveUserData(user);
    	return "index";
    }
	@GetMapping("/index")
	public String completeSignUp() {
		return "index";
	}
}
