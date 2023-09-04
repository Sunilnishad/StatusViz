package com.sunil.lp.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private DataService dataService;
	
	@GetMapping("/getStatus")
    public ResponseEntity<String> getStatusByFeatureId(@RequestParam("featureId") String featureId) {
        String status = dataService.getStatusByFeatureId(featureId);
        if (status != null) {
            return ResponseEntity.ok(status);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	

}