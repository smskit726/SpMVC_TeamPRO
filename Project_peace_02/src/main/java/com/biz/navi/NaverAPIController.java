package com.biz.navi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin("http://127.0.0.1:5500")
@RestController
@RequestMapping(value = "/api")
public class NaverAPIController {

	@Autowired
	private NaverServiceImpl nService;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json;charset=utf8")
	public MapVO naverSearch(String sPos, String aPos) {
		String queryURL = nService.queryURL(sPos, aPos);
		
		MapVO res = nService.getNaverPath(queryURL);
		log.debug("res >>> " + res.toString());
		
		return res;
	}
	
}
