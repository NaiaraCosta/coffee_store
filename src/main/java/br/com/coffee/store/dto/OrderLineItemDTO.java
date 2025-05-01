package br.com.coffee.store.dto;

import br.com.coffee.store.generated.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemDTO {

    private String name;
    private Size size;
    private Integer quantity;
    private BigDecimal cost;

}