package com.pactera.utils;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pactera.utils.StringUtils;



public class StringUtilsTest {

	@Test
	public void testIsEmpty() {
		String emptyStr = "";
		String nullStr = null;
		assertTrue(StringUtils.isEmpty(emptyStr));
		assertTrue(StringUtils.isEmpty(nullStr));
	}
	
	@Test
	public void testIsEmpty2() {
		String emptyStr = "123";
		String nullStr = null;
		assertTrue(StringUtils.isEmpty(emptyStr));
		assertTrue(StringUtils.isEmpty(nullStr));
	}
}
