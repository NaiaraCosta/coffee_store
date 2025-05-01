package br.com.coffee.store.controller;

import br.com.coffee.store.dto.CoffeeOrderDTO;
import br.com.coffee.store.dto.CoffeeOrderUpdateDTO;
import br.com.coffee.store.service.CoffeeOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/coffee_orders")
@Slf4j
public class CoffeeOrderController {

    private CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CoffeeOrderDTO newOrder(@RequestBody CoffeeOrderDTO coffeeOrderDTO) {
        log.info("Received the request for an order: {}", coffeeOrderDTO);
        return coffeeOrderService.newOrder(coffeeOrderDTO);
    }

    @PutMapping("/{order_id}")
    @ResponseStatus(HttpStatus.OK)
    public CoffeeOrderUpdateDTO UpdateCoffeeOrder(@PathVariable("order_id") String orderId
            , @Valid @RequestBody CoffeeOrderUpdateDTO coffeeOrderUpdateDTO) {

        log.info("Received Request for an order");

        return coffeeOrderService.updateOrder(orderId, coffeeOrderUpdateDTO);

    }

}