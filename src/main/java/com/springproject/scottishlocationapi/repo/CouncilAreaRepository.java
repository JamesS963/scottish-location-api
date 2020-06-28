package com.springproject.scottishlocationapi.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.scottishlocationapi.model.CouncilArea;

@Repository
public interface CouncilAreaRepository extends CrudRepository<CouncilArea, Long >{

}
