package com.williamdy.bp.math;

import static org.junit.Assert.*;

import org.junit.Test;

import com.williamdy.bp.math.RemoveRupLetters;

public class RemoveRupLettersTest {
	/***
	 * removeDuplicateLetters
	 * @param s string combine of a-z
	 * @return letters in s order by dictionary
	 */
	
	@Test
	public void test1() {
		String result = RemoveRupLetters.removeDuplicateLetters("dcdba");
		assertEquals("abcd", result);
	}
	
	@Test
	public void test2() {
		String result = RemoveRupLetters.removeDuplicateLetters("dcdddcfdba");
		assertEquals("abcdf", result);
	}
}
