package com.gigateam.internetshopapi.repository;

import com.gigateam.internetshopapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
