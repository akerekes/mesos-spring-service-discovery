package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.QuotesService;
import demo.service.RandomNumberService;

@Controller
public class QuotesController {

	@Autowired
	private QuotesService quotesService;

	@RequestMapping("/quote")
	public @ResponseBody String getQuote() {
		return quotesService.getQuote();
	}
}
