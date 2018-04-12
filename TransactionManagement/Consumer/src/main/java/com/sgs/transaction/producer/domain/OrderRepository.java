package com.sgs.transaction.producer.domain;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String>{
}
