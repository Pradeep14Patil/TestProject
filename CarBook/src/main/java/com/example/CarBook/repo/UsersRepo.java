package com.example.CarBook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CarBook.enties.Users;

public interface UsersRepo extends JpaRepository<Users, Long> {

	Users findByUserId(String userId);

}
