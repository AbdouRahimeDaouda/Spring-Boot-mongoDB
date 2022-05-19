package com.example.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.time.DayOfWeek;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    public String id;

    public String name;
    public String address;

    public int capacity;

    public Set<DayOfWeek> openingDays;
}
