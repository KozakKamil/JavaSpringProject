package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerOrder {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long orderID;
  @ManyToOne
  @JoinColumn(name="personID")
  private Supplier supplier;

  @ManyToMany
  @JoinTable(name = "order_product", joinColumns = {@JoinColumn(name = "orderID")},
    inverseJoinColumns = {@JoinColumn(name = "product_ID")})
  private List<Product> productList;

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public Long getOrderID() {
    return orderID;
  }

  public void setOrderID(Long orderID) {
    this.orderID = orderID;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }
}
