package com.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xoriant")
public class Controller {
	@RequestMapping(value="/login/{user}/{pswd}", method=RequestMethod.GET)	
	public String getOrder(@PathVariable(value="user") String user,@PathVariable(value="pswd") String pswd) {
		if(user.equals(pswd)){
			return "Logged in  "+user;
		}
		else
			return "failed";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Register createNewAd(@RequestBody Register ad) {
		System.out.println("New add created!!");
		ad.setId(333);
		return ad;
	}
	
	@RequestMapping(value="/order1", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Register createNewAd1(@RequestBody Register ad) {
		System.out.println("New order created!!");
		ad.setId(333);
		return ad;
	}
}
