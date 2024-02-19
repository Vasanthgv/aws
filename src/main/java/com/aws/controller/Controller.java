package com.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping(value="/v")
public String getMsg() {
	return "hello....";
}
}
