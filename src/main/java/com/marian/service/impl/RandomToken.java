package com.marian.service.impl;

import org.apache.commons.lang.RandomStringUtils;

public class RandomToken {
	public static String gemerateRandom() {
		String str = RandomStringUtils.randomAlphabetic(100);
		return str;
	}

}
