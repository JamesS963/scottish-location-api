package com.springproject.scottishlocationapi.web;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.springproject.scottishlocationapi.model.Location;
import com.springproject.scottishlocationapi.service.LocationService;

@RunWith(SpringRunner.class)
@WebMvcTest(LocationRestController.class)
@ContextConfiguration(classes = { LocationService.class, LocationRestController.class})
public class LocationRestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LocationService locationService;

	@Before
	public void setup() {

	}

	@Test
	public void testThatLocationControllerReturnsAListOfCouncilAreas() throws Exception {
		when(locationService.getAll()).thenReturn(new ArrayList<Location>());
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().contentType("application/json"));
	}

}
