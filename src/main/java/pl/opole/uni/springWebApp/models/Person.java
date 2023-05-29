package pl.opole.uni.springWebApp.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long personID;
  private String name;
  private String adderess;

  public Long getPersonID() {
    return personID;
  }

  public void setPersonID(Long personID) {
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
