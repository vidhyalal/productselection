package com.sky.webportal.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.sky.webportal.web.model.Catalogue;
import com.sky.webportal.web.service.CatalogueService;

@RunWith(MockitoJUnitRunner.class)
public class SkyWebPortalTest {
	@Mock
	CatalogueService catService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test_scrap() throws IOException {
		List<Catalogue> expected = new ArrayList<Catalogue>();
		Mockito.when(catService.getProducts()).thenReturn(expected);
	}

}
