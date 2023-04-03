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

  public int getPersonID() {
    return personID;
  }

  public void setPersonID(int personID) {
    this.personID = personID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdderess() {
    return adderess;
  }

  public void setAdderess(String adderess) {
    this.adderess = adderess;
  }
}
