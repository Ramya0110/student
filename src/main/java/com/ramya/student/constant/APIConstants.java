package com.ramya.student.constant;

import java.util.ArrayList;
import java.util.List;

public class APIConstants {
//	add new values added here to WebSecurityConfig
	public static final List<String> ALLOWED_END_POINTS = new ArrayList<String>() {
		{
			add("/token");
			add("/swagger-ui");
			add("/v3/api-docs");
		}
	};
}
