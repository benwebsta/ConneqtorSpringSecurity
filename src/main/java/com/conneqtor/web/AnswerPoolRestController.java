package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

import com.conneqtor.beans.AnswerPool;
import com.conneqtor.service.AnswerPoolService;

@Controller
public class AnswerPoolRestController {

	@Autowired
	private AnswerPoolService answerPoolService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllAnswerPools")
	public @ResponseBody String getAllAnswerPools_JSON(HttpServletRequest request, 
	        													HttpServletResponse response){
		System.out.println("Get all ANSWER POOLS rest controller hit");
		List<AnswerPool> answerPools = answerPoolService.getAllAnswerPools();
		System.out.println("Answer Pools list: ");
		for(int i = 0; i < answerPools.size(); i++)
			System.out.println(answerPools.get(i).toString());
		String jsonResponse = new Gson().toJson(answerPools);
		System.out.println(jsonResponse);
		return jsonResponse;
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/getAlnswerPoolById")
}
