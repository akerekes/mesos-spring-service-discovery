package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.RandomNumberService;

@Controller
public class RandomNumberController {

	@Autowired
	private RandomNumberService randomNumberService;

	@RequestMapping("/random")
	public @ResponseBody int getRandomNumber() {
		return randomNumberService.getRandomNumber();
	}
}
