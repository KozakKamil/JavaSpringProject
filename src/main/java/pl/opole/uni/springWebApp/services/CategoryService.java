package pl.opole.uni.springWebApp.services;

import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Category;
import pl.opole.uni.springWebApp.models.CustomerOrder;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.repositories.ICategoryRepository;
import pl.opole.uni.springWebApp.repositories.IProductRepository;

@Service
public class CategoryService extends MainService<Category, ICategoryRepository> {

  public Category editCategory(Long personID, Category category){
    Category editCategory = repo.getById(personID);
    if(editCategory != null){
      editCategory.setName(category.getName());
      return repo.save(category);
    }
    else
      return null;
  }
}
