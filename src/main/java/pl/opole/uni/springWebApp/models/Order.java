package pl.opole.uni.springWebApp.models;

import javax.persistence.*;

@Entity
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int orderID;
  @ManyToOne
  @JoinColumn(name="supplierID")
  private Supplier supplier;
  //@ManyToMany
  //private Product;
}
