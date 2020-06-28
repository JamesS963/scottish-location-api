package com.springproject.scottishlocationapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOCATION_TYPE")
public class LocationType {
	@Id
	@Column(name = "LOCATION_TYPE_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationTypeId;

	private String name;
}
