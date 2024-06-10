package com.alke.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alke.wallet.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
