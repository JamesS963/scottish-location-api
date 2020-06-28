package com.springproject.scottishlocationapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Location {

	@Id
	@Column(name = "LOCATION_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationId;

	@Column(name = "LOCATION_NAME")
	private String locationName;

	@Column(name = "POSTCODE_AREA")
	public String postcodeArea;

	@Column(name = "AREA_CODE")
	public short areaCode;

	@ManyToOne
	@JoinColumn(name = "LOCATION_TYPE_ID")
	private LocationType type;

	private int population;

	@ManyToOne
	@JoinColumn(name="COUNCIL_AREA_ID")
	private CouncilArea councilArea;
}
