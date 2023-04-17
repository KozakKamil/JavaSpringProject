package pl.opole.uni.springWebApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long categoryID;
  private String name;

  public Long getCategoryID() {
    return categoryID;
  }

  public void setCategoryID(Long categoryID) {
    this.categoryID = categoryID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
