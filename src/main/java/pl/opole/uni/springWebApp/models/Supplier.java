package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier extends Person{
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int supplierID;
 private String nip;
 private String regon;

  public int getSupplierID() {
    return supplierID;
  }

  public void setSupplierID(int supplierID) {
    this.supplierID = supplierID;
  }

  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public String getRegon() {
    return regon;
  }

  public void setRegon(String regon) {
    this.regon = regon;
  }
}
