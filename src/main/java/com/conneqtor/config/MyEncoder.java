package com.conneqtor.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		System.out.println(encoder.encode("admin"));
	}
}
