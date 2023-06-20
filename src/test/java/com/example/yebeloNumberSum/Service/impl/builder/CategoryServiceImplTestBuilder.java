package com.example.yebeloNumberSum.Service.impl.builder;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;

public class CategoryServiceImplTestBuilder {

    protected CategoryGetRequest buildCategoryGetRequest(){
        return CategoryGetRequest.builder()
                .categoryCode("code")
                .build();
    }

    protected Category buildCategory(){
        return Category.builder()
                .categoryCode("code")
                .number(1L)
                .build();
    }

    protected CategoryResponse buildResponseForNull(){
        return CategoryResponse.builder()
                .oldValue(0L)
                .newValue(0L)
                .build();
    }

    protected CategoryResponse buildResponse(){
        return CategoryResponse.builder()
                .oldValue(1L)
                .newValue(10L)
                .build();
    }
}
