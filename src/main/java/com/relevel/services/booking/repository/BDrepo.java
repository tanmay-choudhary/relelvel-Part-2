package com.relevel.services.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.relevel.services.booking.model.BookingDetail;


@Repository
public interface BDrepo extends CrudRepository<BookingDetail,String>{

}
