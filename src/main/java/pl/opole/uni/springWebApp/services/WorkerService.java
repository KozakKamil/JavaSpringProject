package pl.opole.uni.springWebApp.services;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.repositories.IWorkerRepository;


import java.util.List;

@Service
public class WorkerService extends MainService<Worker, IWorkerRepository> {


}
