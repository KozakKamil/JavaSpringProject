package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import pl.opole.uni.springWebApp.models.UserAcount;
import pl.opole.uni.springWebApp.services.SupplierService;
import pl.opole.uni.springWebApp.services.UserAcountService;

import java.util.List;

public class AcountController {

  @Autowired
private UserAcountService acountService;

  public List<UserAcount> getUser(){
    return acountService.getAllItems();
  }
}
