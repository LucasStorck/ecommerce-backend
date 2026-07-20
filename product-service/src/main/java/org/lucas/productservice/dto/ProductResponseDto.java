package org.lucas.productservice.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponseDto(UUID id, String name, String description, String category, BigDecimal price) {
}
