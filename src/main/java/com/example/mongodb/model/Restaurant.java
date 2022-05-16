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
    /**
     * In the real world, this might be more than one number - e.g. indoor vs outdoor capacity; or capacity per area
     * (e.g. the back room).
     */
    public int capacity;
    /**
     * Currently the restaurant only supports defining the days of the week it is open. Ideally, this would be expanded
     * to allow a restaurant to define opening hours (potentially more than one set of hours a day) per day of the week.
     * Also, in the real world, might need to cater for holidays and abnormal opening.
     */
    public Set<DayOfWeek> openingDays;
}
