package pl.opole.uni.springWebApp.services;

import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.repositories.IProductRepository;
import pl.opole.uni.springWebApp.repositories.ISupplierRepository;

@Service
public class ProductService extends MainService<Product, IProductRepository> {

  public Product editProduct (Long personID, Product product){
    Product editProduct = repo.getById(personID);
    if(editProduct != null){
      editProduct.setName(product.getName());
      editProduct.setGrossPrice(product.getGrossPrice());
      editProduct.setNetPrice(product.getNetPrice());
      editProduct.setCategory(product.getCategory());
      editProduct.setOrderList(product.getOrderList());
      editProduct.setSupplier(product.getSupplier());
      return repo.save(editProduct);
    }
    else
      return null;
  }
}
