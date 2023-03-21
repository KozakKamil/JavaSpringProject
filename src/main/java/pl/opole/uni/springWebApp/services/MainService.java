package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class MainService<E,R extends JpaRepository<E, Long>> {
  @Autowired
  private R repo;

  public List<E> getAllItems() {

    return repo.findAll();
  }

  public void addItem(E item){

  }
}
