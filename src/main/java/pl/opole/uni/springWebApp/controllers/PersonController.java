package pl.opole.uni.springWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.opole.uni.springWebApp.models.Person;
import pl.opole.uni.springWebApp.services.PersonService;

import java.util.List;

@RestController
public class PersonController {
  @Autowired
  private PersonService personService;
@GetMapping("/Person")
public List<Person> getPerson() {return personService.getPerson();}
}
