package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.bo.SellerBO;
import com.quiz.lesson04.domain.Seller;
@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	
	@Autowired
	private SellerBO sellerBO;
	
	//1번 문제: 판매자 추가 화면
	//http://localhost:8080/lesson04/quiz01/add-seller-view
	@GetMapping(path = "/add-seller-view")
	public String addSellerView() {
		return "lesson04/addSeller"; //jsp view 경로
		
	}
	
	//1번 문제: 판매자 추가 후 결과페이지로 이동
	//http://localhost:8080/lesson04/quiz01/add-seller
	@PostMapping("/add-seller")
	public String addSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam(value="profileImageUrl", required=false) String profileImageUrl,
			@RequestParam(value="temperature", required=false) Double temperature) {
		
		//DB Insert
		sellerBO.addSeller(nickname, profileImageUrl, temperature);
		
		return "lesson04/afterAddSeller";
	}	
	//2번. 최신 판매자 한명 가져오는 페이지
	//http://localhost:8080/lesson04/quiz01/seller-info
	//3번
	//http://localhost/lesson04/quiz01/seller_info?id=1
	@GetMapping("/seller-info")
	public String sellerInfo (
			@RequestParam(value="id", required=false) Integer id,
			Model model) {
		Seller seller = null;
		if(id == null) {
			seller = sellerBO.getLatestSeller();
			model.addAttribute("seller", seller);
		} else {
			seller = sellerBO.getSellerById(id);
		}
		model.addAttribute("seller", seller);
		return "lesson04/sellerInfo";
	
	}
	
	
}

