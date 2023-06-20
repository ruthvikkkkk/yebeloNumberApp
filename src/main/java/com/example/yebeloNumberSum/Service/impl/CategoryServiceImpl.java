package com.example.yebeloNumberSum.Service.impl;

import com.example.yebeloNumberSum.Repository.CategoryRepository;
import com.example.yebeloNumberSum.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;


}
