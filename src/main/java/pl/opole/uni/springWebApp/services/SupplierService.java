package pl.opole.uni.springWebApp.services;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Supplier;
import pl.opole.uni.springWebApp.repositories.ISupplierRepository;


import java.util.List;

@Service
public class SupplierService extends MainService<Supplier, ISupplierRepository> {

}
