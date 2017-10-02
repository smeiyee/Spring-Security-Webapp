package my.com.myriadeas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model) {

		model.addAttribute("message",
				"Everyone can access Home page without signing in.");

		// Spring uses InternalResourceViewResolver and return back home.jsp
		return "home";

	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(ModelMap model) {

		model.addAttribute("message",
				"Only admin can view this page after signing in");
		
		return "admin";

	}
	
	@RequestMapping(value = "/dba", method = RequestMethod.GET)
	public String dba(ModelMap model) {

		model.addAttribute("message",
				"Only user with admin role and dba role can view this page after signing in");
		
		return "dba";

	}

}