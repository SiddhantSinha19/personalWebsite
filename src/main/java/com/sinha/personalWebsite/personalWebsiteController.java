package com.sinha.personalWebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personalWebsiteController {
	@GetMapping("/")
	public String welcome() {
		return "cool";
	}
}
