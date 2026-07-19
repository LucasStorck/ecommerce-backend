package org.lucas.productservice.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponse(UUID id, String name, String description, String category, BigDecimal price) {
}
