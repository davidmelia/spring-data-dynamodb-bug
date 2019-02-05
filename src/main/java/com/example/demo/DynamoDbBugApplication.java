package com.example.demo;

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.TableNameOverride;
import com.example.demo.repository.DynamoRepository;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackageClasses = DynamoRepository.class, dynamoDBMapperConfigRef = "dynamoDBMapperConfig")
public class DynamoDbBugApplication {

  public static void main(String[] args) {
    SpringApplication.run(DynamoDbBugApplication.class, args);

  }

  @Bean(name = "amazonDynamoDB")
  public AmazonDynamoDB amazonDynamoDb() {
    AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard();
    builder.setEndpointConfiguration(new EndpointConfiguration("http://localhost:8000", "eu-west-1"));
    return builder.build();
  }

  @Bean(name = "dynamoDBMapperConfig")
  public DynamoDBMapperConfig dynamoDbMapperConfig() {
    DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();
    builder.setTableNameOverride(TableNameOverride.withTableNamePrefix("dave-"));
    builder.setTypeConverterFactory(DynamoDBMapperConfig.DEFAULT.getTypeConverterFactory());
    return builder.build();
  }
}
