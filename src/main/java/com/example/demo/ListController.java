package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

	@RequestMapping("/list")
	public List list() {
		return new List(1333, "TESTCONTENT");
	}
}
