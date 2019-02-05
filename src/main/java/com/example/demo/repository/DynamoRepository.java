package com.example.demo.repository;

import org.springframework.stereotype.Service;

@Service
public class DynamoRepository {

  private final SomeCrudRepository someCrudRepository;

  public DynamoRepository(SomeCrudRepository someCrudRepository) {
    this.someCrudRepository = someCrudRepository;
  }



}
