package com.springproject.scottishlocationapi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="COUNCIL_AREA")
@NoArgsConstructor
public class CouncilArea {
	@Id
	@Column(name = "COUNCIL_AREA_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long councilAreaId;
	
	private String name;
	
	private int population;
	private BigDecimal area;
	private BigDecimal density;
}
