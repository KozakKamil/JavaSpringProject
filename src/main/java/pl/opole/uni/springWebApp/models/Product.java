package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;

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
  @ManyToMany
  private List<Order> orderList;

  public List<Order> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<Order> orderList) {
    this.orderList = orderList;
  }

  public int getProduct_ID() {
    return product_ID;
  }

  public void setProduct_ID(int product_ID) {
    this.product_ID = product_ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(double netPrice) {
    this.netPrice = netPrice;
  }

  public double getGrossPrice() {
    return grossPrice;
  }

  public void setGrossPrice(double grossPrice) {
    this.grossPrice = grossPrice;
  }

  public int getVat() {
    return vat;
  }

  public void setVat(int vat) {
    this.vat = vat;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }
}
