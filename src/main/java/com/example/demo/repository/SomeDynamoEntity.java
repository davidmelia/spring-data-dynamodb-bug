package com.example.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = SomeDynamoEntity.TABLE_NAME)
public class SomeDynamoEntity {

  public static final String KEY_NAME = "id";

  public static final String TABLE_NAME = "some-table";

  @DynamoDBHashKey(attributeName = KEY_NAME)
  private String key;

  @DynamoDBAttribute
  private String value;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


}
