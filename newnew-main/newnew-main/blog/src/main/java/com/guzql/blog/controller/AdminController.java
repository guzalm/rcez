package com.guzql.blog.controller;

import com.guzql.blog.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/add-dessert")
public class AdminController {

    @GetMapping
    public String showAddDessertForm(Model model) {
        model.addAttribute("dessert", new Coffee());
        return "add-dessert";
    }

    @PostMapping
    public String addDessert(@ModelAttribute Coffee coffee) {
        // Логика добавления десерта
        return "redirect:/main";
    }
}
