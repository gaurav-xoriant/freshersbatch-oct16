package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xoriant")
public class Controller 
{
	PostAd pu;
	List<PostAd> post;
	//login
	@RequestMapping(value="/login/{uname}/{pass}", method=RequestMethod.GET)
	public String login(@PathVariable(value="uname") String username,@PathVariable(value="pass") String password)
	{
		Login u = new Login(username,password);
		if(username.equals(password))
		{
			return "login Successfull "+username;
		}
		else
			return "failed";
	}
	//logout
	@RequestMapping(headers={"auth_token"}, value="/logout", method=RequestMethod.DELETE)
	public String logout(@RequestHeader String auth_token)
	{
		if(auth_token.isEmpty()) //equals("true")
			return "failed to logout";
		else
			return "Logout Succcessfully....";
	}
	
	//get All Categories
	@RequestMapping(value="/categories", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAllCategory()
	{
		pu = new PostAd(1,"open","Laptop Sale", "Gaurav", "Hardware", "intel core 3", 2, "a.jpg", "b.jpg");
		PostAd pa2 = new PostAd(2,"open","Laptop Sale", "Sukan", "Soft", "intel core 3", 2, "a.jpg", "b.jpg");
		
		List <String> l = new ArrayList<String>();
		l.add(pu.getCategory());
		l.add(pa2.getCategory());
		post.add(pu);
		
		return l;
	}
	
	//postAdd
	@RequestMapping(value="/postAd", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public PostAd postAdd(@RequestBody PostAd pa)
	{
	
			System.out.println("Add Posted..."+pa);
			return pa;
	}
	
	//updateAdd
	@RequestMapping(value="/postAd", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public PostAd updateAdd(@RequestBody PostAd pa)
	{
			System.out.println("updated Post..."+pa);
			return pa;
	}
	
	//usersAddvertisement
	@RequestMapping(value="/posts/{uname}", method=RequestMethod.GET)
	public String usersAdd(@PathVariable(value="uname") String username)
	{
		System.out.println(username);
		return username;
		
	}
	
	
}
