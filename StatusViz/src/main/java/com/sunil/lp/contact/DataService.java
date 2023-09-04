package com.sunil.lp.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataService {

	public DataService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UserRepository userRepository;
	
	
	 public String getStatusByFeatureId(String featureId) {
	        Feature feature = userRepository.findByFeatureId(featureId);
	        return feature != null ? feature.getStatus() : null;
	    }

}
