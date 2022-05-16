package com.example.mongodb;

public class RestaurantNotFoundException extends RuntimeException{
    public RestaurantNotFoundException(String id){
        super("Restaurant with id: " + id + " Not Found!!!");
    }
}
