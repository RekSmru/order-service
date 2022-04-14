package com.smt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smt.entity.Order;
import com.smt.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order) {
		return orderservice.saveOrder(order);
	}

}
