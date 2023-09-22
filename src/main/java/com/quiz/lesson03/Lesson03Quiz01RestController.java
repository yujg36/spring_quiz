package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.realEstateBO;
import com.quiz.lesson03.domain.realEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	
	@Autowired
	private realEstateBO realestateBO;
	
	//요청 url: http://localhost:8080/lesson03/quiz01/1?id=20
	@RequestMapping("/1")
	public realEstate quiz01_1(
			@RequestParam("id") int id) {
		
		return realestateBO.getrealEstateById(id);
		
	}
	
	//요청 url: http://localhost:8080/lesson03/quiz01/2?rent_price=90
	@RequestMapping("/2")
	public List<realEstate> quiz01_2(
			@RequestParam("rent_price") int rentPrice) {
		
		return realestateBO.getrealEstateByRentPrice(rentPrice);
	}

	//요청 url: http://localhost/lesson03/quiz01/3?area=90&price=130000
	@RequestMapping("/3")
	public List<realEstate> quiz01_3(
			@RequestParam("price") int price &
			@RequestParam("area") int area){
		
	}
