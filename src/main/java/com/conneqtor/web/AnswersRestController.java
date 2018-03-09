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

}
