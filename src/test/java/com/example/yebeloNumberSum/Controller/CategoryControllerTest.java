package com.example.yebeloNumberSum.Controller;

import com.example.yebeloNumberSum.Controller.builder.CategoryControllerTestBuilder;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;
import com.example.yebeloNumberSum.Service.CategoryService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CategoryControllerTest extends CategoryControllerTestBuilder {

    @InjectMocks
    private CategoryController categoryController;

    @Mock
    CategoryService service;

    @Test
    public void executeFetchNumberTest(){
        CategoryGetRequest request = CategoryGetRequest.builder()
                .categoryCode("code")
                .build();

        when(service.getNumber(request)).thenReturn(buildResponse());
        ResponseEntity<CategoryResponse> response = categoryController.getNewNumber(buildCategoryGetRequest());

        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(), buildResponse());
        verify(service).getNumber(request);

    }

}