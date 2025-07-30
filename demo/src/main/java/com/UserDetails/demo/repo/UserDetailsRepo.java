package com.UserDetails.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserDetails.demo.entities.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {

}
