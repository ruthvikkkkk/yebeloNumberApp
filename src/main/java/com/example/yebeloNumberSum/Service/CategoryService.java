package com.example.yebeloNumberSum.Service;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;

public interface CategoryService {
    CategoryResponse getNumber(CategoryGetRequest request);

    Category save(CategorySaveRequest category);
}