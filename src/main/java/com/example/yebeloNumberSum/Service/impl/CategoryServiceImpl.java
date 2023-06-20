package com.example.yebeloNumberSum.Service.impl;

import com.example.yebeloNumberSum.Entity.Category;
import com.example.yebeloNumberSum.Repository.CategoryRepository;
import com.example.yebeloNumberSum.Request.CategoryGetRequest;
import com.example.yebeloNumberSum.Request.CategorySaveRequest;
import com.example.yebeloNumberSum.Response.CategoryResponse;
import com.example.yebeloNumberSum.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;


    @Override
    public synchronized CategoryResponse getNumber(CategoryGetRequest request) {
        long startTime = System.currentTimeMillis();
        Category category = repository.findById(request.getCategoryCode()).orElse(null);
        if(Objects.nonNull(category)){
            long currentNumber = category.getNumber();
            long nextNumber = currentNumber + 1;

            while(getDigitSum(nextNumber) != 1){
                nextNumber++;
            }
            category.setNumber(nextNumber);
            repository.saveAndFlush(category);
            long endTime = System.currentTimeMillis() - startTime;
            if(endTime < 5000) {
                try {
                    Thread.sleep((5000-endTime));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return CategoryResponse.builder()
                    .oldValue(currentNumber)
                    .newValue(nextNumber)
                    .build();
        }
        return CategoryResponse.builder()
                .oldValue(0L)
                .newValue(0L)
                .build();
    }

    @Override
    public synchronized Category save(CategorySaveRequest category) {
        return repository.save(
                Category.builder()
                        .categoryCode(category.getCategoryCode())
                        .number(category.getNumber())
                        .build()
        );
    }

    private Long getDigitSum(Long number){
        long sum = 0L;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if(sum >= 10){
            return getDigitSum(sum);
        }
        return sum;
    }
}
