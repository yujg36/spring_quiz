package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.realEstate;
import com.quiz.lesson03.mapper.realEstateMapper;

@Service
public class realEstateBO {
	
	@Autowired
	private realEstateMapper realestateMapper;
	//input: id(정수)
	//output: realEstate
	public realEstate getrealEstateById(int id) {
		return realestateMapper.selectrealEstateById(id);
	}
	
	public List<realEstate> getrealEstateByRentPrice(int rentPrice) {
		return realestateMapper.selectrealEstateByRentPrice(rentPrice);
	}
}
