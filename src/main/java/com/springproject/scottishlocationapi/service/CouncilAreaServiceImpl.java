package com.springproject.scottishlocationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.scottishlocationapi.model.CouncilArea;
import com.springproject.scottishlocationapi.repo.CouncilAreaRepository;

@Service
public class CouncilAreaServiceImpl implements CouncilAreaService {
	
	@Autowired
	private CouncilAreaRepository councilAreaRepo;

	@Override
	public List<CouncilArea> getAll() {
		return (List<CouncilArea>) councilAreaRepo.findAll();
	}

}
