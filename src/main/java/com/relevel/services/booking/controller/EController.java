package com.relevel.services.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.relevel.services.booking.service.BDservice;
import com.relevel.services.booking.service.Eservice;



@Controller
public class EController {
	
	@Autowired
	BDservice bs;
	
	@Autowired
	Eservice es;
	
	
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public ResponseEntity<String> register(@RequestParam String name,@RequestParam String type) {
////		if (bs.checkId(name,type)) {
////			String resp = "User is registered successfully";
////			return ResponseEntity.status(HttpStatus.CREATED).body(resp);
////		}
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Input");
//	}
	
	@RequestMapping(path="search/{name}/{type}",method = RequestMethod.GET)
	public ResponseEntity<String> register(@PathVariable String name,@PathVariable String type) {
//		if (bs.checkId(name,type)) {
//			String resp = "User is registered successfully";
//			return ResponseEntity.status(HttpStatus.CREATED).body(resp);
//		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Input");
	}

//	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
//	public ResponseEntity<String> login(@RequestBody UserDto userDto) {
//		if (userServ.authenticaeUser(userDto)) {
//			String resp = "authorized";
//			return ResponseEntity.status(HttpStatus.OK).body(resp);
//		}
//		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("unauthorized");
//	}

}
