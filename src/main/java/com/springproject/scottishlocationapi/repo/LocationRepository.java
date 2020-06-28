package com.springproject.scottishlocationapi.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.scottishlocationapi.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

}
