package codeforgood.controller;

import org.springframework.web.bind.annotation.RestController;

import codeforgood.model.Profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodeForGoodController {
    
	
    @RequestMapping("/update")
    public String updateForm(Map<String, Object> model) {
        return "update";
    }
    
    @RequestMapping("/postUpdate")
    public String postUpdate(@RequestParam(value="message", required=false) String message, Map<String,String> model) {
    	model.put("message", message);
    	model.put("test", "showing some text");
        return "updateSuccess";
    }
    
    @RequestMapping("/postUpdate2")
    public String postUpdate2() {
    	int totalPoints;
    	return "updateProfile";
    }
    @RequestMapping("/updateAcademics")
    public String updateAcadmics(@RequestParam(value="class1"+"class2", required=false) String class1, String class2){
    	System.out.println(class1+class2);
    	//if (text1!=null)
    	//Profile.getAcademics().setAcademicPoints();
    	//if (text2!=null)
    		//Profile.getAcademics().setAcademicPoints();	
    	//	
    	System.out.println(Profile.getAcademics().getAcademicPoints());
    	return "academics";
    }
    
}
