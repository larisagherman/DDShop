package dd.projects.ddshop.controller;

import dd.projects.ddshop.entity.Category;
import dd.projects.ddshop.service.CategoryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryServiceImpl categoryService;

    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

}