package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Worker;

import java.util.List;

public class MainService<E ,R extends JpaRepository<E, Long>> {
  @Autowired
  public R repo; //to nie błąd

  public List<E> getAllItems() {

    return repo.findAll();
  }

  public E addItem(E item)
  {
    return repo.save(item);
  }

}
