package pl.opole.uni.springWebApp.services;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.repositories.IWorkerRepository;


import java.util.List;

@Service
public class WorkerService extends MainService<Worker, IWorkerRepository> {

  public Worker addWorker (Worker newworker){
    return repo.save(newworker);
  }

  public Worker editWorker (Long personID, Worker worker){
    Worker editWorker = repo.getById(personID);
    if(editWorker != null){
      editWorker.setName(worker.getName());
      //worker.setPersonID(Math.toIntExact(personID));
      return repo.save(worker);
    }
    else
      return null;
  }

}