package RailApp.Pnr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PnrController {
	
	@RequestMapping("/pnr")
	public String getPnrStatus(HttpServletRequest request) {
		
		String pnr=(String) request.getAttribute("pnrNo");
		final String uri="";
		final String responseClass="";
		
		
		return "index";
	}
	
}
