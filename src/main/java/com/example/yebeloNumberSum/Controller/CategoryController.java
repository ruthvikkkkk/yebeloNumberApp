package com.example.yebeloNumberSum.Controller;

import com.example.yebeloNumberSum.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}