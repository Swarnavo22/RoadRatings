package com.ratings.RoadRatingsService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ratings.RoadRatingsService.model.Ratings;


public interface RatingsRepository extends JpaRepository<Ratings,String> {
	
	List<Ratings> findByUserId(String id);
}
