package com.example.yebeloNumberSum.Service.impl;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Repository.CategoryRepository;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;
import com.example.yebeloNumberSum.Service.impl.builder.CategoryServiceImplTestBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceImplTest extends CategoryServiceImplTestBuilder {

    @InjectMocks
    private CategoryServiceImpl service;

    @Mock
    private CategoryRepository repository;

    @Test
    public void executeGetTest_WhenCategoryNotExists(){
        when(repository.findById("code")).thenReturn(Optional.empty());
        CategoryResponse response = service.getNumber(buildCategoryGetRequest());
        assertEquals(response, buildResponseForNull());
        verify(repository).findById("code");
    }

    @Test
    public void executeGetTest_WhenCategoryExists(){
        when(repository.findById("code")).thenReturn(Optional.ofNullable(buildCategory()));
        CategoryResponse response = service.getNumber(buildCategoryGetRequest());
        assertEquals(response, buildResponse());
        verify(repository).findById("code");
    }

}