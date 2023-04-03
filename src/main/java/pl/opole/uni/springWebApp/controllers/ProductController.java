package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.services.ProductService;
import pl.opole.uni.springWebApp.services.SupplierService;

import java.util.List;

@RestController
public class ProductController {
  @Autowired
  private ProductService productService;
  @GetMapping("/Product")
  public List<Product> getProduct()
  {
    return productService.getAllItems();
  }
  @PostMapping("/Product")
  public Product addProduct(@RequestBody Product newProduct)
  {
    return productService.addItem(newProduct);
  }

  @PutMapping("/Product")
  public Product editProduct(@RequestParam Long productID, @RequestBody  Product newProduct){
    return productService.editProduct(productID,newProduct);
  }
}
