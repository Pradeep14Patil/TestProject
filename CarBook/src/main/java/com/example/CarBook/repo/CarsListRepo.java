package com.example.CarBook.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CarBook.enties.CarsList;

public interface CarsListRepo extends JpaRepository<CarsList, Long> {

	List<CarsList> findByUserId(String userId);

}
