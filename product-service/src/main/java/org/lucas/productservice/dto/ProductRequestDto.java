package org.lucas.productservice.dto;

import java.math.BigDecimal;

public record ProductRequestDto(String name, String description, String category, BigDecimal price) {
}
