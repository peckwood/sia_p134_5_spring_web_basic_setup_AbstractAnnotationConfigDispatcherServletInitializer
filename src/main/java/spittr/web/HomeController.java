package spittr.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//declared to be a controller
@RequestMapping({"/", "/homepage"})//map controller to /
public class HomeController {
	
	//handle GET requests
	@RequestMapping(method=GET)
	public String home(){
		//view name is home
		return "home";
	}
}
