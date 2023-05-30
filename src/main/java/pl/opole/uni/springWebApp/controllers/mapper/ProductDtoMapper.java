package pl.opole.uni.springWebApp.controllers.mapper;

import pl.opole.uni.springWebApp.controllers.dto.ProductNameDto;
import pl.opole.uni.springWebApp.models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductDtoMapper {

  public static List<ProductNameDto> mapProductToProductName(List<Product> list){
    return list.stream().map(
      product ->
        new ProductNameDto(
          product.getProduct_ID(),
          product.getName())).collect(Collectors.toList());
  }
}
