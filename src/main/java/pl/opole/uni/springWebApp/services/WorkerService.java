package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Person;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.repositories.IWorkerRepository;

import java.util.List;

@Service
public class WorkerService {
  @Autowired
  private IWorkerRepository IWorkerRepository;

  public List<Worker> getWorker() {

    return IWorkerRepository.findAll();
  }

}
