package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.services.ProductService;
import pl.opole.uni.springWebApp.services.SupplierService;

import java.util.List;
import java.util.Optional;

@RestController
@Secured({"ROLE_ADMIN", "ROLE_USER"})
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
  @Autowired
  private ProductService productService;
  @GetMapping("/Product")
  public List<Product> getProduct()
  {
    return productService.getAllItems();
  }

  @DeleteMapping("/Product")
  public void deleteProduct(@RequestParam Long productID){
    productService.deletleItem(productID);
  }

  @GetMapping("/ProductDetails")
  public Product getOneProduct(@RequestParam Long productID){
    var products = productService.getAllItems();
    var desiredProduct = products.stream()
      .filter(product -> product.getProduct_ID() == productID)
      .findFirst();
    Product product = desiredProduct.orElse(null);

    return product;
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
