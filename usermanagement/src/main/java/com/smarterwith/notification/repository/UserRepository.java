package com.smarterwith.notification.repository;


import com.smarterwith.notification.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
