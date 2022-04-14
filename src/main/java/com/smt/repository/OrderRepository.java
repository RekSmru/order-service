package com.smt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smt.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
