package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	// 요청 url: http://localhost:8080/lesson03/quiz01/1?id=20
	@RequestMapping("/1")
	public RealEstate quiz01_1(
			@RequestParam("id") int id) {
		
		return realEstateBO.getRealEstateById(id); // response body => json
	}
	
	// 요청 URL: http://localhost:8080/lesson03/quiz01/2?rent_price=90
	@RequestMapping("/2")
	public List<RealEstate> quiz01_2(
			@RequestParam("rent_price") int rentPrice) {
		
		return realEstateBO.getRealEstateListByRentPrice(rentPrice);
	}
	
	// 요청 URL: http://localhost:8080/lesson03/quiz01/3?area=90&price=130000
	@RequestMapping("/3")
	public List<RealEstate> quiz01_3(
			@RequestParam(value="area") int area,
			@RequestParam("price") int price) {
		
		return realEstateBO.getRealEstateListByAreaPrice(area, price);   // response body => JSON
	}
}
