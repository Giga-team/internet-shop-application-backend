package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
