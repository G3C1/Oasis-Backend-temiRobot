package com.g3ci.temiRobot.domain.food.repository;

import com.g3ci.temiRobot.domain.food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
