package br.com.coffee.store.dto;

import br.com.coffee.store.generated.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoffeeOrderUpdateDTO {

    private OrderStatus orderStatus;
    
}