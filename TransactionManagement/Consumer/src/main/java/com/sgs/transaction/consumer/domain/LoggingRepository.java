package com.sgs.transaction.consumer.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoggingRepository extends CrudRepository<Logging, String> {

    List<Logging> findByUsername(String username);

}
