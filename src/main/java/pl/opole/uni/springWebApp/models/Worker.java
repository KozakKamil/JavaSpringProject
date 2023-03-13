package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Worker extends Person{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int workerID;
  private String contractType;
  private float salary;
  private String pesel;

  public int getWorkerID() {
    return workerID;
  }

  public void setWorkerID(int workerID) {
    this.workerID = workerID;
  }

  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public String getPesel() {
    return pesel;
  }

  public void setPesel(String pesel) {
    this.pesel = pesel;
  }
}
