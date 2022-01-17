package com.ratings.RoadRatingsService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ratings.RoadRatingsService.dao.RatingsRepository;
import com.ratings.RoadRatingsService.model.Ratings;

@Service
public class RatingsService {

	@Autowired
	RatingsRepository ratingsRepository;
	
	public List<Ratings> getAllRatingsByUserId(String userId){
		return ratingsRepository.findByUserId(userId);
	}
}
