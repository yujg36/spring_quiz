package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.Mapper.storeMapper;
import com.quiz.lesson02.domain.store;

@Service
public class storeBO {
	
	@Autowired
	private storeMapper storeMapper;
	
	//input:x
	//output: List<Store>
	public List<store> getstoreList(){
		return storeMapper.selectstoreList();
	}
}
