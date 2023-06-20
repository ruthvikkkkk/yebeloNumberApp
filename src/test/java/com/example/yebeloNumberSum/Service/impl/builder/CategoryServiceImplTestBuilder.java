package com.example.yebeloNumberSum.Service.impl.builder;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;

public class CategoryServiceImplTestBuilder {

    protected CategorySaveRequest buildCategorySaveRequest(){
        return CategorySaveRequest.builder()
                .categoryCode("code")
                .number(1L)
                .build();
    }

    protected Category buildCategory(){
        return Category.builder()
                .categoryCode("code")
                .number(1L)
                .build();
    }
}
