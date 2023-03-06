package pl.opole.uni.springWebApp.models;

import javax.persistence.*;

@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int product_ID;
  private String name;
  private double netPrice;
  private double grossPrice;
  private int vat;
  @ManyToOne
  @JoinColumn(name="categoryID")
  private Category category;
  @ManyToOne
  @JoinColumn(name="supplierID")
  private Supplier supplier;


}
