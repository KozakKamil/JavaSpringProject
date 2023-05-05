package pl.opole.uni.springWebApp.services;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.repositories.ISupplierRepository;


import java.util.List;

@Service
public class SupplierService extends MainService<Supplier, ISupplierRepository> {

  public Supplier editSupplier(Long personID, Supplier supplier){
    Supplier editSupplier = repo.getById(personID);
    if(editSupplier != null){
      editSupplier.setName(supplier.getName());
      editSupplier.setNip(supplier.getNip());
      editSupplier.setAdderess(supplier.getAdderess());
      editSupplier.setRegon(supplier.getRegon());
      return repo.save(editSupplier);
    }
    else
      return null;
  }
}
