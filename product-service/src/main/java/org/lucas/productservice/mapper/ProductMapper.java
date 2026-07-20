package org.lucas.productservice.mapper;

import org.lucas.productservice.dto.ProductRequestDto;
import org.lucas.productservice.dto.ProductResponseDto;
import org.lucas.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  ProductResponseDto toResponse(Product product);

  @Mapping(target = "id", ignore = true)
  Product toEntity(ProductRequestDto productRequestDto);
}
