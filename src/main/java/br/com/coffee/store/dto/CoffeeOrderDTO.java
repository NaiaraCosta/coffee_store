package br.com.coffee.store.dto;

import br.com.coffee.store.generated.PickUp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoffeeOrderDTO {

    private String id;
    private String name;
    private String nickName;
    private StoreDTO store;
    private List<OrderLineItemDTO> orderLineItems;
    private PickUp pickUp;
    private String status;
    private LocalDateTime orderTime;

}