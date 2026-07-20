package org.lucas.productservice.service;

import org.lucas.productservice.dto.ProductRequestDto;
import org.lucas.productservice.dto.ProductResponseDto;
import org.lucas.productservice.mapper.ProductMapper;
import org.lucas.productservice.model.Product;
import org.lucas.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  @Override
  public ProductResponseDto create(ProductRequestDto productRequestDto) {
    Product product = productMapper.toEntity(productRequestDto);
    Product createdProduct = productRepository.save(product);
    return productMapper.toResponse(createdProduct);
  }

  @Override
  public List<ProductResponseDto> read() {
    return productRepository.findAll().stream()
            .map(productMapper::toResponse)
            .toList();
  }
}
