package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.repositories.ISupplierRepository;
import pl.opole.uni.springWebApp.repositories.IWorkerRepository;

import java.util.List;

@Service
public class SupplierService {
  @Autowired
  private ISupplierRepository ISupplierRepository;

  public List<Supplier> getSupplier(){
    return ISupplierRepository.findAll();
  }
}
