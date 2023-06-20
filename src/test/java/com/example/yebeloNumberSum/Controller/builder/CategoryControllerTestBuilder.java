package com.example.yebeloNumberSum.Controller.builder;

import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;

public class CategoryControllerTestBuilder {

    protected CategoryGetRequest buildCategoryGetRequest(){
        return CategoryGetRequest.builder()
                .categoryCode("code")
                .build();
    }

    protected CategoryResponse buildResponse(){
        return CategoryResponse.builder()
                .oldValue(1L)
                .newValue(10L)
                .build();
    }
}
