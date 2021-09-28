package com.springredis.springbootcrudredisexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data //for getters and setters
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product") // I want the class Product (domain) to be my Hash in Redis
public class Product implements Serializable {
@Id
    private int id;
    private String name;
    private int qty;
    private long price;
}
