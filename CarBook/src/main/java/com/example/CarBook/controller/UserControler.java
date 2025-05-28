package com.example.CarBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarBook.enties.Users;
import com.example.CarBook.repo.UsersRepo;

@RestController
public class UserControler {

	@Autowired
	UsersRepo usersRepo;

	@PostMapping("/user")
	public ResponseEntity<String> createUser(@RequestBody Users user) {
		usersRepo.save(user);
		return ResponseEntity.ok("User created");
	}
	@GetMapping("/get")
	public Users Hello(@RequestBody Users userName) {
		Users user = usersRepo.findByUserId(userName.getUserId());
		if(user==null) {
			throw new RuntimeException("User Not Found");
		}else {
			return user;
		}
	}
}
