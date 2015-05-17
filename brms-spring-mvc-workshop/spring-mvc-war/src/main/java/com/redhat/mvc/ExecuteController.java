package com.redhat.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/execute")
public class ExecuteController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		System.out.println( "execute" );
		return "execute";
	}
}