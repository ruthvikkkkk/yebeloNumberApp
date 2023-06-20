package com.example.yebeloNumberSum.Service;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;

public interface CategoryService {
    CategoryResponse getNumber(String categoryCode);

    Category save(CategorySaveRequest category);
}