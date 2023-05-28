package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.Feedback;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

  @Query("""
      SELECT f
      FROM Feedback f
      WHERE f.itemId = :itemId
  """)
  List<Feedback> findAllByItemId(@Param("itemId") Long itemId);

}
