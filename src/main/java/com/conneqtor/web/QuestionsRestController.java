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

import com.conneqtor.beans.Questions;
import com.conneqtor.service.QuestionsService;

@Controller
public class QuestionsRestController {

	@Autowired
	private QuestionsService questionsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllQuestions")
	public @ResponseBody String getAllQuestions_JSON(HttpServletRequest request, 
	        													HttpServletResponse response){
		System.out.println("Get all QUESTIONS rest controller hit");
		List<Questions> questions = questionsService.getAllQuestions();
		System.out.println("Questions list: ");
		for(int i = 0; i < questions.size(); i++)
			System.out.println(questions.get(i).toString());
		String jsonResponse = new Gson().toJson(questions);
		System.out.println(jsonResponse);
		return jsonResponse;
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/getAlnswerPoolById")
}
