package com.example.au.couchbasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Bms;

public interface BmsRepository extends CrudRepository<Bms, String> {

	Bms findByMoviename(String moviename);
	
}
