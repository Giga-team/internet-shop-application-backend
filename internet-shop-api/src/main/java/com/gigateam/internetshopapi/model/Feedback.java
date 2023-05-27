package com.gigateam.internetshopapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "feedbacks")
public class Feedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JoinColumn(name = "user_id")
  @ManyToOne(targetEntity = User.class)
  private Long userId;

  @JoinColumn(name = "item_id")
  @ManyToOne(targetEntity = Item.class)
  private Long itemId;

  @Column(name = "comment", columnDefinition = "TEXT")
  private String comment;

  @Column(name = "rate")
  private Integer rate; //TODO: mb save as Enum?

}