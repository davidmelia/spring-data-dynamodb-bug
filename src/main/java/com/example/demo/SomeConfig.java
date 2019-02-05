package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {

  // @Bean(name = "amazonDynamoDB")
  // public AmazonDynamoDB amazonDynamoDb() {
  // AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard();
  // builder.setEndpointConfiguration(new EndpointConfiguration("http://localhost:8000",
  // "eu-west-1"));
  // return builder.build();
  // }
  //
  // @Bean(name = "dynamoDBMapperConfig")
  // public DynamoDBMapperConfig dynamoDbMapperConfig() {
  // DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();
  // builder.setTableNameOverride(TableNameOverride.withTableNamePrefix("dave-"));
  // builder.setTypeConverterFactory(DynamoDBMapperConfig.DEFAULT.getTypeConverterFactory());
  // return builder.build();
  // }

}
