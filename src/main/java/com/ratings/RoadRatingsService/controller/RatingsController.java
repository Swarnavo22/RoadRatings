package com.ratings.RoadRatingsService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ratings.RoadRatingsService.model.Ratings;
import com.ratings.RoadRatingsService.model.RequestPOJO;
import com.ratings.RoadRatingsService.model.ResponsePojo;
import com.ratings.RoadRatingsService.service.RatingsService;

@RestController
public class RatingsController {

	@Value("${api.key}")
    private String apiKey;
	
	 @Autowired
	 private RestTemplate restTemplate;
	
	@Autowired
	RatingsService ratingsService;
	@Autowired
	RequestPOJO requestPOJO;
	@Autowired
	ResponsePojo responsePojo;
	
	@RequestMapping("/ratings/{userId}")
	public String getStarted(@PathVariable("userId") String userId) {
		
		List<Ratings> list = ratingsService.getAllRatingsByUserId(userId);
		System.out.println(list);
		System.out.println(list.size());
		
		//for(int i=0;i<list.size()-1;i++) {
			//for(int j=i+1;j<list.size();j++) {
				
				Ratings rat1 = list.get(0);
				Ratings rat2 = list.get(1);
				System.out.println(rat1);
				System.out.println(rat2);
				
				String var1 = rat1.getStreetName()+", "+rat1.getPostalCode();
				String var2 = rat2.getStreetName()+", "+rat2.getPostalCode();
				System.out.println(var1);
				System.out.println(var2);
				
				String[] locations = {var1,var2};
				System.out.println(locations[0]+" "+locations[1]);
				
				
				requestPOJO.setLocations(locations);
				
				//Call the API and Store the response
				
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				HttpEntity<Object> requestEntity = new HttpEntity<>(requestPOJO,headers);
				
				ResponseEntity<ResponsePojo> responseEntity = restTemplate.exchange("http://www.mapquestapi.com/directions/v2/route?key=" +  apiKey, HttpMethod.POST, requestEntity, ResponsePojo.class);
				
				HttpStatus statusCode = responseEntity.getStatusCode();
				System.out.println(statusCode);
				
				ResponsePojo obj = responseEntity.getBody();
				System.out.println(obj.getDistance());
				System.out.println(obj.isHasTimedRestriction());
				System.out.println(obj.getFuelUsed());
				//ResponsePojo responsePojo  = restTemplate.postForObject("http://www.mapquestapi.com/directions/v2/route?api_key=" +  apiKey, requestPOJO, ResponsePojo.class);
				
				 //System.out.println(responsePojo.getDistance());
	
				
				//Check if distance< 1 mile. If yes, then increase count and update database 
			//}
		//}
		
		
		
		
		return null;
	}
}
