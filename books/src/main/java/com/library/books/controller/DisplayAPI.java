package com.library.books.controller;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.books.model.Address;
import com.library.books.service.DisplayService;

@RestController
@RequestMapping(value = "/library")
public class DisplayAPI {
	@Autowired
	private DisplayService displayService;
	
	// private static final Logger logger = LogManager.getLogger(DisplayAPI.class.getName());
	
	@GetMapping(value = "/address/{libraryId}")
	public ResponseEntity<Address> showAddress(@PathVariable Integer libraryId) {
		Address a = new Address();
		ResponseEntity<Address> response = new ResponseEntity<Address>(a, HttpStatus.OK);
		return response;
	}
}
