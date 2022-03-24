package com.relevel.services.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.relevel.services.booking.model.BookingDetail;
import com.relevel.services.booking.model.ExpertDetail;

@Repository
public interface Erepo extends CrudRepository<ExpertDetail,String>{

}
