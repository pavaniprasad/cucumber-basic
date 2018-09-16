package com.techstack.transformer;

import cucumber.api.Transformer;

public class EmailTransformer extends Transformer<String> {

	@Override
	public String transform(String userName) {
		return userName.concat("@teckstack.com");
	}

}
