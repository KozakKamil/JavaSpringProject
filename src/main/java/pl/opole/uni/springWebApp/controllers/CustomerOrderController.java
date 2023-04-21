package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.CustomerOrder;
import pl.opole.uni.springWebApp.models.Product;
import pl.opole.uni.springWebApp.services.CustomerOrderService;
import pl.opole.uni.springWebApp.services.ProductService;

import java.util.List;

  @RestController
  @Secured({"ROLE_ADMIN", "ROLE_USER"})
  public class CustomerOrderController {
    @Autowired
    private CustomerOrderService customerOrderService;

    @GetMapping("/CustomerOrder")
    public List<CustomerOrder> getCustomerOrder()
    {
      return customerOrderService.getAllItems();
    }

    @PostMapping("/CustomerOrder")
    public CustomerOrder addCustomerOrder(@RequestBody CustomerOrder newCustomerOrder)
    {
      return customerOrderService.addItem(newCustomerOrder);
    }

    @PutMapping("/CustomerOrder")
    public CustomerOrder editCustomerOrder(@RequestParam Long customerOrderID, @RequestBody  CustomerOrder newCustomerOrder){
      return customerOrderService.editCustomerOrder(customerOrderID,newCustomerOrder);
    }
  }

