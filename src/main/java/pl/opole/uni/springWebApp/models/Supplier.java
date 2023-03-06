package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int supplierID;
  private String name;
  private String adderess;


}
