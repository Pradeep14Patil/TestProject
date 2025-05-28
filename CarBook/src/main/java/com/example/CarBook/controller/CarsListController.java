package com.example.CarBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarBook.enties.CarsList;
import com.example.CarBook.repo.CarsListRepo;

@RestController
public class CarsListController {
	@Autowired
	private CarsListRepo carsListRepo;

	@PostMapping("/addCars")
	public  ResponseEntity<String> addCars(@RequestBody List<CarsList> cars)
	{
		carsListRepo.saveAll(cars);
		return ResponseEntity.ok("Cars Added");
	}

	@GetMapping("/getCars")
	public List<CarsList> getCarsByUser(@RequestBody CarsList carsList)
	{
		List<CarsList> carsListForUser = carsListRepo.findByUserId(carsList.getUserId());
		if(carsListForUser.isEmpty()) {
			throw new RuntimeException("Cars Not Found For this User");
		}else {
			return carsListForUser;
		}
	}
	public void test() {
		
	}
}
