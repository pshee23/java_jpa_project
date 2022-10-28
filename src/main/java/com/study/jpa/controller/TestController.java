package com.study.jpa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {

	@GetMapping(value = "/test")
	public ResponseEntity<String> apiTest(HttpServletRequest httpRequest) {
		log.info("Test api");
		return new ResponseEntity<>("Test Api", new HttpHeaders(), HttpStatus.OK);
	}
}
