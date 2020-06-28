package com.springproject.scottishlocationapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.scottishlocationapi.model.CouncilArea;
import com.springproject.scottishlocationapi.service.CouncilAreaService;

@RestController
@CrossOrigin
public class CouncilAreaRestController {

	@Autowired
	CouncilAreaService councilAreaService;

	@GetMapping("/councilAreas")
	public List<CouncilArea> getAll() {
		return councilAreaService.getAll();
	}
}
