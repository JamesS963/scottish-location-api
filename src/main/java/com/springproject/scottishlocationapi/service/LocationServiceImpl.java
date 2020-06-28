package com.springproject.scottishlocationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.scottishlocationapi.model.Location;
import com.springproject.scottishlocationapi.repo.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Location> getAll() {
		return (List<Location>) locationRepository.findAll();
	}

}
