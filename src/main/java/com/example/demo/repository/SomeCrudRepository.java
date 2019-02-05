package com.example.demo.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SomeCrudRepository extends CrudRepository<SomeDynamoEntity, String> {

}
