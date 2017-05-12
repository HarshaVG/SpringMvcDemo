package com.springmvc.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Objects;
//import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.Matchers.hasProperty;
//import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


public class TestWelcomeController {

	WelcomeController wc = new WelcomeController();
	ModelMap mm = new ModelMap();

	@Test
	public void printWelcomeTest() {
		String wcStr="welcome";
		String retStr= wc.printWelcome(mm);
		assertEquals(wcStr,retStr);
	}

}
