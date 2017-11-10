package com.springboot;

import com.springboot.binarysearch.BinarySearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InitialSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(InitialSpringBootApplication.class, args);
		BinarySearch search = applicationContext.getBean(BinarySearch.class);

		int n = 5;
		boolean result = search.apply(new int[]{10000, 2, 2, 5, 2, 200, 100, 20, 30, 11, 11, 2, 2, 1, 3, 12, 0, 0, 10000000}, 5);

		System.out.printf("%d is in the list? %s ", n, result);
	}
}
