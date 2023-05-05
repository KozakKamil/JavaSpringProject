package pl.opole.uni.springWebApp.services;

import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.CustomerOrder;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.repositories.ICustomerOrderRepository;
import pl.opole.uni.springWebApp.repositories.IProductRepository;

import javax.transaction.Transactional;

@Service
public class CustomerOrderService extends MainService<CustomerOrder, ICustomerOrderRepository> {

  public CustomerOrder editCustomerOrder(Long personID, CustomerOrder customerOrder){
    CustomerOrder editCustomerOrder = repo.getById(personID);
    if(editCustomerOrder != null){
      editCustomerOrder.setSupplier(customerOrder.getSupplier());
      editCustomerOrder.setProductList(customerOrder.getProductList());
      return repo.save(customerOrder);
    }
    else
      return null;
  }

@Transactional
  public void MoveToOtherOrder(CustomerOrder orderFrom, CustomerOrder orderTo, int index){

     var product =orderFrom.getProductList().get(index);

     var listFrom = orderFrom.getProductList();
     listFrom.remove(product);
     orderFrom.setProductList(listFrom);
    repo.save(orderFrom);

     var listTo = orderTo.getProductList();
     listTo.add(product);
     orderTo.setProductList(listTo);
     repo.save(orderTo);
  }
}
