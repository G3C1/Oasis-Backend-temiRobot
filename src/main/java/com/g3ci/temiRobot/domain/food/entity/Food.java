package com.g3ci.temiRobot.domain.food.entity;

import com.g3ci.temiRobot.domain.category.entity.Category;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String img;
    private String description;
    private Integer servings;
    private Long price;
    @ManyToOne()
    private Category category;
}
