package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.domain.realEstate;

@Repository
public interface realEstateMapper {
	
	public realEstate selectrealEstateById(int id);

	public List<realEstate> selectrealEstateByRentPrice(@Param("rentPrice1") int rentPrice);

}
