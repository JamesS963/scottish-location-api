package com.springproject.scottishlocationapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.scottishlocationapi.model.Location;
import com.springproject.scottishlocationapi.service.LocationService;

@RestController
@CrossOrigin
public class LocationRestController {

	@Autowired
	LocationService locationService;
	
	@GetMapping("/")
	public List<Location> getAll(){
		return locationService.getAll();
	}
	
}
