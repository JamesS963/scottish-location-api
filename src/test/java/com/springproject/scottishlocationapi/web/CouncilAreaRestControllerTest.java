package com.springproject.scottishlocationapi.web;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.springproject.scottishlocationapi.model.CouncilArea;
import com.springproject.scottishlocationapi.service.CouncilAreaService;

@RunWith(SpringRunner.class)
@WebMvcTest(CouncilAreaRestController.class)
@ContextConfiguration(classes = { CouncilAreaService.class, CouncilAreaRestController.class })
public class CouncilAreaRestControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CouncilAreaService councilAreaService;

	@Before
	public void setup() {

	}

	@Test
	public void testThatGetCouncilAreasReturnslistOfCouncilAreas() throws Exception {
		when(councilAreaService.getAll()).thenReturn(new ArrayList<CouncilArea>());
		mockMvc.perform(get("/councilAreas")).andExpect(status().isOk()).andExpect(content().contentType("application/json"));
	}
}
