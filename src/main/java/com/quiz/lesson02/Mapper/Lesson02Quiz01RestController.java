package com.quiz.lesson02.Mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.bo.storeBO;
import com.quiz.lesson02.domain.store;

@RestController
public class Lesson02Quiz01RestController {
	
	@Autowired
	private storeBO storeBO;
	
	//요청 URL: http://localhost:8080/lesson02/quiz01
	@RequestMapping("/lesson02/quiz01")
	public List<store> quiz01(){
		List<store> storeList = storeBO.getstoreList();//바로 리턴해도 상관 없음
		return storeList;
		
	}
}
