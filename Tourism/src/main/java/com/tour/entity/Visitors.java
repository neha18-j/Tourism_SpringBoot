package com.tour.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Visitors {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
	@NotEmpty(message = "Name must be filled")
  private String name;
	@Max (value = 50,message = "Values must be minimum 10")
  private int age;
}
