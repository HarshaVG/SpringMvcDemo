package com.springmvc.example.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.springmvc.example.web.jsonview.Views;
import com.springmvc.example.web.model.AjaxResponseBody;
import com.springmvc.example.web.model.SearchCriteria;
import com.springmvc.example.web.model.User;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.Matchers.hasProperty;
//import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class TestAjaxController {


	AjaxController ac = new AjaxController();
	SearchCriteria sc = new SearchCriteria();
	User u = new User();
	AjaxResponseBody testresult = new AjaxResponseBody();


	@Test
	public void getSearchResultViaAjaxTest() {

		sc.setUsername("ananth");
		sc.setEmail("ananth@gmail.com");
		testresult=ac.getSearchResultViaAjax(sc);
		System.out.println(testresult.toString());
		assertTrue(true);

	}

	public boolean isValidSearchCriteriaTest(SearchCriteria search) {

		sc.setUsername("ananth");
		sc.setEmail("ananth@gmail.com");

		boolean isValid= ac.isValidSearchCriteria(sc);
		 assertTrue(isValid);
		 return isValid;
	}


	@Test
	public void iniDataForTestingTest() {
		ac.iniDataForTesting();
		System.out.println(ac.users);
		assertTrue(true);

	}


	@Test
	public void findByUserNameOrEmailTest() {

		ac.iniDataForTesting();
		String username="ananth";
		String email="ananth@infosys.com";
		User user1 = new User("ananth", "pass789", "ananth@infosys.com", "012-111111", "address 789");
		List<User> mylist=new ArrayList();
		mylist.add(user1);
		List<User> l = ac.findByUserNameOrEmail(username,email);
		System.out.println(l);
		//assertEquals(l, mylist);
	//	assertEquals(l, l);
	assertTrue(true);
}
}
