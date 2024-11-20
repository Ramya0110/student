package com.ramya.student.constant;

public class SwaggerConstants {
	public static class Example{
		public static final String GLOBAL_EXCEPTION_RESPONSE_EXAMPLE = "{\r\n"
				+ "  \"type\": \"Type of Exception\",\r\n"
				+ "  \"reason\": \"Reason for the Exception\",\r\n"
				+ "  \"timestamp\": \"YYYY-MM-DDTHH:MM:ss.SSSZ\"\r\n"
				+ "}";
		public static final String STUDENT_RESPONSE_EXAMPLE = "{\r\n"
				+ "    \"stdId\" : null,\r\n"
				+ "    \"stdDeptId\" : {\"deptId\": 1},\r\n"
				+ "    \"stdSection\" : \"A\",\r\n"
				+ "    \"stdName\" : \"Shree\",\r\n"
				+ "    \"stdDob\" : \"YYYY-MM-DD\",\r\n"
				+ "    \"stdGender\" : \"M\"\r\n"
				+ "}";
	}
}
