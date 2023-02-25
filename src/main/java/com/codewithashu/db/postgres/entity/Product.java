package com.codewithashu.db.postgres.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="entities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   private String name;

   private String description;

   private boolean live;

   private double price;
}
