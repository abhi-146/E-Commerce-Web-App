package com.abhinav.major.service;

import com.abhinav.major.model.Category;
import com.abhinav.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
       return  categoryRepository.findAll();
    }
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public Optional<Category> getCategoryById(int id){
        return categoryRepository.findById(id);
    }

    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }


}
