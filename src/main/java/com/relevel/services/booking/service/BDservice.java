package com.relevel.services.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relevel.services.booking.model.BookingDetail;
import com.relevel.services.booking.model.ExpertDetail;

import com.relevel.services.booking.repository.BDrepo;
import com.relevel.services.booking.repository.Erepo;


class Temp {

	public String name;
	public String nu;
	public double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNu() {
		return nu;
	}
	public void setNu(String nu) {
		this.nu = nu;
	}
	public double getRating() {
		return rating;
	}
	public void setRatung(double ratung) {
		this.rating = ratung;
	}
	
}

@Service
public class BDservice {

	@Autowired
	BDrepo bdr;
	
	@Autowired
	Erepo er;
	
	private List<Temp> checkId(String a, String b) {
//		Iterable<User> temp1 = userRepo.findAll();
//	    List<User> result = new ArrayList<User>();
//    	temp1.forEach(result::add);
		Iterable<BookingDetail> temp1 = bdr.findAll();
		List<BookingDetail> result = new ArrayList<BookingDetail>();
		temp1.forEach(result::add);
		Iterable<ExpertDetail> temp2 = er.findAll();
		List<ExpertDetail> result1 = new ArrayList<ExpertDetail>();
		temp2.forEach(result1::add);
		List<ExpertDetail> temp = new ArrayList<ExpertDetail>();
		for(ExpertDetail user: temp2) {
    		if(user.getExpertise().equals(b)) {
    			temp.add(user);
    		}
    	}
		List<Temp> abc = new ArrayList<Temp>();
		for(ExpertDetail user: temp) {
		    int x =0,y=0;
		    double rating =0;
			for(BookingDetail user1: temp1) {
				x++;
	    		if(user1.getExpertId().equals(user.getExpertId())) {
	    			if(user1.getRating()!=0) {
	    				rating = rating + user1.getRating();
	    			}
	    		}
	    	}
			if(x!=0) {
				rating = rating/x;
			}
			Temp as = new Temp();
			as.name = user.getExpertName();
			as.nu = user.getExpertMobile();
			as.rating = rating;
			abc.add(as);
			
    	}
		return abc;
	}
}
