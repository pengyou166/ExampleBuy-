package claire.peng;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {

	private static Integer aAmount = 10;
	private static Integer bAmount = 20;
	@RequestMapping(value= {"/buy","/error"}, method = RequestMethod.POST)	
    public String buy(@RequestParam(value = "aBuy") Integer param1, @RequestParam(value = "bBuy") Integer param2, Model model) {
        System.out.println("get param1  "+param1+"  param2 "+param2);
        if(param1>aAmount||param2>bAmount) {
        	model.addAttribute("aAmount", aAmount);
    		model.addAttribute("bAmount", bAmount);
    		model.addAttribute("aBuy", 0);
    		model.addAttribute("bBuy", 0);
    		
        	return "error";
        }
		if(null != param1){
        	if(aAmount>param1){
        		aAmount -= param1;
        	}else{
        		aAmount = 0;
        	}
        }
        if(null != param2){
        	if(bAmount>param2){
        		bAmount -= param2;
        	}else{
        		bAmount = 0;
        	}
        }
        
		model.addAttribute("aAmount", aAmount);
		model.addAttribute("bAmount", bAmount);
        return "buy";
    }
	
	@RequestMapping(value="/buy", method = RequestMethod.GET)
    public String show( Model model) {

		model.addAttribute("aAmount", aAmount);
		model.addAttribute("bAmount", bAmount);
        return "buy";
    }
}
