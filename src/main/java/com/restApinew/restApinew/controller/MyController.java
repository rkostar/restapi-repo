package com.restApinew.restApinew.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restApinew.restApinew.entity.Api;
import com.restApinew.restApinew.services.ApiService;

@CrossOrigin
@RestController
public class MyController {
	@Autowired
	public ApiService apiService;
	
	@GetMapping("/")
	public String home() {
		return "hello";
	}
	
	@GetMapping("/api")
	public List<Api> getData(){
		return apiService.getData();
	}
	
	@GetMapping("/api/{apiId}")
	public Api getApi(@PathVariable String apiId) {
		return apiService.getApi(Long.parseLong(apiId));
	}
}
