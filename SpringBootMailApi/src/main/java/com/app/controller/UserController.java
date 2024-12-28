package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.User;
import com.app.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        boolean isAuthenticated = userService.login(email, password);
        if (isAuthenticated) {
            return "redirect:/user/home";
        }
        model.addAttribute("error", "Invalid email or password.");
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        String message = userService.registerUser(user);
        model.addAttribute("message", message);
        return "redirect:/user/login";
    }

    @GetMapping("/set-password")
    public String setPasswordPage(@RequestParam String email, @RequestParam String token, Model model) {
        model.addAttribute("email", email);
        model.addAttribute("token", token);
        return "set-password";
    }

    @PostMapping("/set-password")
    public String setPassword(@RequestParam String email, @RequestParam String password, Model model) {
        String message = userService.setPassword(email, password);
        model.addAttribute("message", message);
        return "login";
    }
}