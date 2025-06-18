package com.roninEngineerF02.shoppingOnline.repository;

import com.roninEngineerF02.shoppingOnline.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}