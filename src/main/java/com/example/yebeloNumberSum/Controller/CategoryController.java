package com.example.yebeloNumberSum.Controller;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;
import com.example.yebeloNumberSum.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getNumber")
    public ResponseEntity<CategoryResponse> getNewNumber(@RequestBody CategoryGetRequest request){
        return new ResponseEntity<>(categoryService.getNumber(request.getCategoryCode()), HttpStatus.OK);
    }

    @PostMapping("/saveCategory")
    public ResponseEntity<Category> saveCategory(@RequestBody CategorySaveRequest category){
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }
}