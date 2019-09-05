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
    @PostMapping("/sing_up")
    public String completeSignUp(@ModelAttribute User user, Model model) {
		Integer generatedId = userService.saveUserData(user);
    	model.addAttribute("userId", generatedId);
    	return "index";
    }
	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}
}
