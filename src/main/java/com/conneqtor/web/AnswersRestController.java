package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conneqtor.beans.Answers;
import com.conneqtor.beans.AnswersCompareDTO;
import com.conneqtor.beans.Users;
import com.conneqtor.service.AnswersService;
import com.google.gson.Gson;

@Controller
public class AnswersRestController {
	
	@Autowired AnswersService answersService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllAnswers")
	public @ResponseBody String getAllAnswers_JSON(HttpServletRequest request, 
	        													HttpServletResponse response) {
		System.out.println("Get all ANSWERS rest controller hit");
		List<Answers> answers = answersService.getAllAnswers();
		for(int i = 0; i < answers.size(); i++)
			System.out.println(answers.get(i).toString());
		String jsonResponse = new Gson().toJson(answers);
		return jsonResponse;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getAnswersByUserId")
	public @ResponseBody String getAnswersByUserIdJson(@RequestBody String usersJson) {
		System.out.println("Get ANSWERS BY USER ID rest controller hit");
		
		Gson gson = new Gson();
		Users user = gson.fromJson(usersJson, Users.class);
		
		Answers answers = answersService.getAnswersByUserId(user.getUserId());
		String jsonResponse = new Gson().toJson(answers);
		
		return jsonResponse;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createAnswers")
	public @ResponseBody String createAnswers_JSON(@RequestBody String answersJson) {
		System.out.println("CREATE ANSWERS rest controller hit");
		Gson gson = new Gson();
		Answers answers = gson.fromJson(answersJson, Answers.class);
		boolean answersResponse = answersService.createAnswers(answers);
		System.out.println(answersResponse);
		if(answersResponse)
			return "true";
		else
			return "false";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/compareAnswers")
	public @ResponseBody String usersIdsJson(@RequestBody String usersIdsJson) {
		System.out.println("COMPARE ANSWERS rest controller hit");		
		
		Gson gson = new Gson();
		
		AnswersCompareDTO answersCompareDTO = new AnswersCompareDTO();
		answersCompareDTO = gson.fromJson(usersIdsJson, AnswersCompareDTO.class);	
		System.out.println("answersCompareDTO: " + answersCompareDTO.toString());
		
		int usersId1 = answersCompareDTO.getUsersId1();
		int usersId2 = answersCompareDTO.getUsersId2();
		System.out.println("usersId1: " + usersId1);
		System.out.println("usersId2: " + usersId2);
		double percent = answersService.compareAnswers(usersId1, usersId2);
		String jsonResponse = new Gson().toJson(percent);
		
		return jsonResponse;
	}

}
