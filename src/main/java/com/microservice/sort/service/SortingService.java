package com.microservice.sort.service;

import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class SortingService {
	public int[] sortIntegers(int[] numbers) {
		Arrays.sort(numbers);
		return numbers;
	}
}
