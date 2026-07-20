package org.lucas.productservice.service;

import org.lucas.productservice.dto.ProductRequestDto;
import org.lucas.productservice.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

  ProductResponseDto create(ProductRequestDto productRequestDto);

  List<ProductResponseDto> read();
}
