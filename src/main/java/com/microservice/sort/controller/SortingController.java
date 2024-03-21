package com.microservice.sort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.sort.service.SortingService;

@RestController
public class SortingController {
	
	@Autowired
	private SortingService sortingService;
	
	@PostMapping("/sort")
	public int[] sortIntegers(@RequestBody int[] numbers) {
        return sortingService.sortIntegers(numbers);
    }
}
