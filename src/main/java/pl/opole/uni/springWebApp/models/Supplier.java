package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;

@Entity
public class Supplier extends Person{

  private String nip;
  private String regon;
}
