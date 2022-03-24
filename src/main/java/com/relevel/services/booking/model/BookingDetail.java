package com.relevel.services.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingDetail {
//	BookingId INTEGER PRIMARY KEY,
//    UserId varchar(255) references Users(UserId),
//    ServiceId INTEGER references Services(ServiceId),
//    ExpertId INTEGER references ExpertDetails(ExpertId),
//    FinalPrice DECIMAL,
//    BookingStatus varchar(255),
//    Rating DECIMAL
	@Id
	private String BookingId;
	private String UserId;
	private String SeriviceId;
	private String ExpertId;
	private String FinalPrice;
	private String BookingStatus;
	private double Rating;
	public String getBookingId() {
		return BookingId;
	}
	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getSeriviceId() {
		return SeriviceId;
	}
	public void setSeriviceId(String seriviceId) {
		SeriviceId = seriviceId;
	}
	public String getExpertId() {
		return ExpertId;
	}
	public void setExpertId(String expertId) {
		ExpertId = expertId;
	}
	public String getFinalPrice() {
		return FinalPrice;
	}
	public void setFinalPrice(String finalPrice) {
		FinalPrice = finalPrice;
	}
	public String getBookingStatus() {
		return BookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		BookingStatus = bookingStatus;
	}
	public double getRating() {
		return Rating;
	}
	public void setRating(double rating) {
		Rating = rating;
	}
	
	
	
	

}
