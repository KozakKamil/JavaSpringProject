package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.opole.uni.springWebApp.models.Worker;
import pl.opole.uni.springWebApp.services.WorkerService;

import java.util.List;

@RestController
@Secured({"ROLE_ADMIN", "ROLE_USER"})
public class WorkerController {
  @Autowired
  private WorkerService workerService;

  @GetMapping("/Worker")
  public List<Worker> getWorker() {
    return workerService.getAllItems();
  }

  @PostMapping("/Worker")
  public Worker addWorker(@RequestBody Worker newWorker){
    return workerService.addItem(newWorker);
  }

  @PutMapping("/Worker")
  public Worker editWorker(@RequestParam Long id, @RequestBody Worker newWorker){
    return workerService.editWorker(id, newWorker);
  }
}
