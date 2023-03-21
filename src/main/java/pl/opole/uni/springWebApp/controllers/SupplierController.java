package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.services.SupplierService;

import java.util.List;

@RestController
public class SupplierController {
  @Autowired
  private SupplierService supplierService;
  @GetMapping ("/Supplier")
  public List<Supplier> getSupplier() {
    return supplierService.getSupplier();
  }
}
