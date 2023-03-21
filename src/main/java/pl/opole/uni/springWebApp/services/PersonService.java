package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Person;
import pl.opole.uni.springWebApp.repositories.PersonRepository;

import java.util.List;
@Service
public class  PersonService {
  @Autowired
  private PersonRepository personRepository;
  public List<Person> getPerson() {
    return personRepository.findAll();
  }

}
