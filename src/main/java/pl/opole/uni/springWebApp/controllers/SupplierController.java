package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.services.SupplierService;

import java.util.List;

@RestController
@Secured({"ROLE_ADMIN", "ROLE_USER"})
public class SupplierController {
  @Autowired
  private SupplierService supplierService;
  @GetMapping ("/Supplier")
  public List<Supplier> getSupplier()
  {
    return supplierService.getAllItems();
  }
  @PostMapping("/Supplier")
  public Supplier addSupplier(@RequestBody Supplier newSupplier)
  {
    return supplierService.addItem(newSupplier);
  }

  @PutMapping("/Supplier")
  public Supplier editSupplier(@RequestParam Long personID, Supplier newSupplier){
    return supplierService.addItem(newSupplier);
  }
}
