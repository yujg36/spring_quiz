package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Lesson01Quiz02RestController {

	//http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1(){
		
		List<Map<String, Object>> list  = new ArrayList<>();
		Map<String, Object> movie0 = new HashMap<>();
		movie0.put("rate", 15);
		movie0.put("director", "봉준호");
		movie0.put("time", 131);
		movie0.put("title", "기생충");
		list.add(movie0);
		
		Map<String, Object> movie1 = new HashMap<>();
		movie1.put("rate", 0);
		movie1.put("director", "로베르토 베니니");
		movie1.put("time", 116);
		movie1.put("title", "인생은 아름다워");
		list.add(movie1);
		
		Map<String, Object> movie2 = new HashMap<>();
		movie2.put("rate", 12);
		movie2.put("director", "크리스토퍼 놀란");
		movie2.put("time", 147);
		movie2.put("title", "인셉션");
		list.add(movie2);
		
		Map<String, Object> movie3 = new HashMap<>();
		movie3.put("rate", 19);
		movie3.put("director", "윤종빈");
		movie3.put("time", 133);
		movie3.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(movie3);
		
		Map<String, Object> movie4 = new HashMap<>();
		movie4.put("rate", 15);
		movie4.put("director", "프란시스 로렌스");
		movie4.put("time", 137);
		movie4.put("title", "헝거게임");
		list.add(movie4);
		
		return list;
		
	}
	
	//http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	// @Responsebody+ ReturnString => HttoMessageConverter String(html) => response body에 내려감
	//  HTTPMessageConverter jackson 라이브러리 => JSON이 Response body에 내려감 => API
	public List<Board> quiz02_2(){
		List<Board> result = new ArrayList<>();
		
		Board board = new Board(); //일반 자바 bean(객체)
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다.");
		result.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이었어...금요일인줄");
		result.add(board);
		
		board = new Board();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요");
		board.setUser("dulmary");
		board.setContent("...");
		result.add(board);
		return result;
	}
	
	//http://localhost:8080/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02_3(){
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
