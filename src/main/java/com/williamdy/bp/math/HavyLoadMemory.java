package com.williamdy.bp.math;

public class HavyLoadMemory {
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
	 
	public static void main(String[] args) {
		HavyLoadMemory m = new HavyLoadMemory();
		String s = m.removeDuplicateLetters("sssaaa");
        System.out.println(s);
		//while(true){
//			Thread thread = new Thread(){
//				@Override
//				public 	void run(){
//					try {
//						sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			};
//			thread.start();
//		}
	}
}
