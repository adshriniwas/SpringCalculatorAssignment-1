package com.shri.demo.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/addition")
	public String add() {
		String str = "2+3 = "+ (2 + 3);
		return str;
	}
	@GetMapping("/subtraction")
	public String subtraction() {
		String str = "2-3 = "+ (2 - 3);
		return str;
	}
	@GetMapping("/division")
	public String division() {
		String str = "3/2 = "+ (3/2);
		return str;
	}
	@GetMapping("/multiplication")
	public String multiply() {
		String str = "2 * 3 = "+ (2 * 3);
		return str;
	}
	@GetMapping("/remainder")
	public String remainder() {
		String str = "2 % 3 = "+ (2 & 3);
		return str;
	}
}
