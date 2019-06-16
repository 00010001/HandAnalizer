package com.jcombat.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DemoController {
	public static final String uploadingDir = System.getProperty("user.dir") + "/uploadingDir/";
	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}


}