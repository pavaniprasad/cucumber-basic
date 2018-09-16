package com.techstack.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techstack.beans.Vendor;

@RestController
public class RemittanceController {

	@GetMapping ("api/remittance/provider/{providerId}")
	public String testGet(@PathVariable String providerId) {
		if (providerId.equalsIgnoreCase("XM"))
		return "XM";
		else return "Other Vendor";
	}
	
	@PostMapping("remittance/provider/")
	public String testPost(@RequestBody Vendor vendor) {
		return "Success";
	}
}
