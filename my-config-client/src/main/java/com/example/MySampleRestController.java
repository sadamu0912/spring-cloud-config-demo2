package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MySampleRestController {
	/*@Value("${my-config.appName}")
	private String appName;*/
	
	@Autowired
	private Environment env;
	
	/*@RequestMapping("/app-name")
	public String getAppName() {
		return appName;
	}*/
	
	@RequestMapping("/app-name")
	public String getAppName(){
		return env.getProperty("my-config.appName");
	}
	
	@RequestMapping("/url")
	public String getUrl(){
		return env.getProperty("spring.datasource1.url");
	}
}
