package com.example.mongodb.repo;

import com.example.mongodb.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepo extends MongoRepository<Restaurant,String > {
}
