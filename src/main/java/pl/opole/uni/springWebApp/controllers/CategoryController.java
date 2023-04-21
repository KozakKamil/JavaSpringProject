package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.Category;
import pl.opole.uni.springWebApp.models.CustomerOrder;
import pl.opole.uni.springWebApp.services.CategoryService;
import pl.opole.uni.springWebApp.services.CustomerOrderService;

import java.util.List;

@RestController
@Secured({"ROLE_ADMIN", "ROLE_USER"})
public class CategoryController {
  @Autowired
  private CategoryService categoryService;

  @GetMapping("/Category")
  public List<Category> getCategory()
  {
    return categoryService.getAllItems();
  }

  @PostMapping("/Category")
  public Category addCategory(@RequestBody Category newCategory)
  {
    return categoryService.addItem(newCategory);
  }

  @PutMapping("/Category")
  public Category editCategory(@RequestParam Long categoryID, @RequestBody  Category newCategory){
    return categoryService.editCategory(categoryID,newCategory);
  }
}
