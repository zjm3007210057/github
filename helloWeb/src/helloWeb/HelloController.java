package helloWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getIndex(ModelMap model){
		model.addAttribute("message", "this is hello web demo");
		System.out.println("½øÀ´ÁË");
		return "index";
	}

}
