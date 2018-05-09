package com.williamdy.bp.math;

public class RemoveRupLetters {
	/***
	 * removeDuplicateLetters
	 * @param s string combine of a-z
	 * @return letters in s order by dictionary
	 */
	public String removeDuplicateLetters(String s) {
		String result = null;
		char c = 'a';
		//如果s == null 直接返回null 否则从a-z给result找存在的字符补充
		if (s != null) {
			result = "";
			while (c <= 'z') {
				if (result.length() == s.length()) {
					break;
				}
				if (s.indexOf(c) >= 0) {
					result += c;
				}
				c++;
			}
		}
		return result;
	}
}
