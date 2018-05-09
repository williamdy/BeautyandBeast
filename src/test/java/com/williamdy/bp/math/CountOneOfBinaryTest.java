package com.williamdy.bp.math;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CountOneOfBinaryTest {

	
	
	@Test
	 public void test2(){
		int randNum = 7;
		assertEquals(CountOneOfBinary.rigtMigrate(randNum),3);
    }
	
	@Test
	 public void test3(){
		int randNum = 8;
		assertEquals(1,CountOneOfBinary.andByBit(randNum));
    }
	
	@Test
    public void test1(){
		Random rand = new Random();
		int randNum = rand.nextInt();
		System.out.println(randNum);
		assertEquals(CountOneOfBinary.rigtMigrate(randNum),CountOneOfBinary.andByBit(randNum));
    }
}
