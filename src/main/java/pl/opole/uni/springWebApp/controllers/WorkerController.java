package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.services.WorkerService;

import java.util.List;

@RestController
public class WorkerController {
  @Autowired
  private WorkerService workerService;

  @GetMapping("/Worker")
  public List<Worker> getWorker() {
    return workerService.getAllItems();
  }
}
