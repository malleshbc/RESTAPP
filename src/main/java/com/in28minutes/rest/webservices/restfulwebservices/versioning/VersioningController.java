package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	@GetMapping("v1/person")
	public Person1 person1() {
		return new Person1("Mallesh Chakrasali");
	}
	
	@GetMapping("v2/person")	
	public Person2 person2() {
		return new Person2("Mallesh","Chakrasali");
	}
	
	@GetMapping(value="/person/param",params="version=1")
	public Person1 param1() {
		return new Person1("Mallesh Chakrasali");
	}
	
	@GetMapping(value="/person/param",params="version=2")	
	public Person2 param2() {
		return new Person2("Mallesh","Chakrasali");
	}
	
	@GetMapping(value="/person/header",headers="X-API-VERSION=1")
	public Person1 paramviaheader1() {
		return new Person1("Mallesh Chakrasali");
	}
	
	@GetMapping(value="/person/header",headers="X-API-VERSION=2")	
	public Person2 paramviaheader2() {
		return new Person2("Mallesh","Chakrasali");
	}
}
