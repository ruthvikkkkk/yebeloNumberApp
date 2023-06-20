package com.example.yebeloNumberSum.Service.impl;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Repository.CategoryRepository;
import com.example.yebeloNumberSum.Service.impl.builder.CategoryServiceImplTestBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceImplTest extends CategoryServiceImplTestBuilder {

    @InjectMocks
    private CategoryServiceImpl service;

    @Mock
    private CategoryRepository repository;

    @Test
    public void executeSaveTest(){
        when(repository.save(buildCategory())).thenReturn(buildCategory());
        Category response = service.save(buildCategorySaveRequest());
        assertNotNull(response);
        verify(repository).save(buildCategory());
    }

    @Test
    public void executeGetTest_WhenCategoryNotExists(){
        when(repository.findById("code")).thenReturn(Optional.ofNullable(buildCategory()));
    }
}