package com.example.yebeloNumberSum.Controller;

import com.example.yebeloNumberSum.Request.CategoryRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;
import com.example.yebeloNumberSum.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<CategoryResponse> getNewNumber(@RequestBody CategoryRequest request){
        return new ResponseEntity<>(categoryService.getNumber(request.getCategoryCode()), HttpStatus.OK);
    }
}