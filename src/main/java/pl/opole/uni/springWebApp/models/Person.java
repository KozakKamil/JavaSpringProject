package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
  @Id
  int personID;
  private String name;
  private String adderess;
}
