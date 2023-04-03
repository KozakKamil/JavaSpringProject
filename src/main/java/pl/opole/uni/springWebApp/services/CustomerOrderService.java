package pl.opole.uni.springWebApp.services;

import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.CustomerOrder;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.repositories.ICustomerOrderRepository;
import pl.opole.uni.springWebApp.repositories.IProductRepository;
@Service
public class CustomerOrderService extends MainService<CustomerOrder, ICustomerOrderRepository> {

  public CustomerOrder editCustomerOrder(Long personID, CustomerOrder customerOrder){
    CustomerOrder editCustomerOrder = repo.getById(personID);
    if(editCustomerOrder != null){
      return repo.save(customerOrder);
    }
    else
      return null;
  }
}
