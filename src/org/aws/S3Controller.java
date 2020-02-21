package org.aws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class S3Controller {
	@RequestMapping(value ="/uploadfile")
	public static String uploadFile()
	{
		return "hello";
	}
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "S3Homepage";
	}
}
