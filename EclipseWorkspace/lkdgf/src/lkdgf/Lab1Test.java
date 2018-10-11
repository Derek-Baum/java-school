package lkdgf;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Lab1Test {

	@Test
	public void testAreaScalene()throws Exception {
//		fail("Not yet implemented");
		System.out.println("Testing areaScalene method.");
		assertEquals(3.96,Lab1.areaScalene(5.5, 3.4, 8.7),0.0001);
	}
	@Test
	public void increaseLevel()throws Exception{
		System.out.println("Testing increaseLevel method,");
		assertEquals(0,Lab1.increaseLevel(1, 1));
		assertEquals(2,Lab1.increaseLevel(1, 25));
		assertEquals(1,Lab1.increaseLevel(1, 15));
		assertEquals(0,Lab1.increaseLevel(6, 5));
		assertEquals(1,Lab1.increaseLevel(5, 10));
		
	}
	@Test
	public void shareDigit()throws Exception{
		System.out.println("Testing shareDigit method.");
		assertEquals(true,Lab1.shareDigit(55, 55));
		assertEquals(true,Lab1.shareDigit(35, 51));
		assertEquals(true,Lab1.shareDigit(35, 15));
		assertEquals(true,Lab1.shareDigit(35, 31));
		assertEquals(true,Lab1.shareDigit(35, 13));
		assertEquals(false,Lab1.shareDigit(12, 33));
	}
	@Test
	public void closestFactorToSqrt()throws Exception{
		System.out.println("Testing closestFactorToSqrt method.");
		assertEquals(4,Lab1.closestFactorToSqrt(16));
		assertEquals(2,Lab1.closestFactorToSqrt(10));
		assertEquals(4,Lab1.closestFactorToSqrt(20));
		assertEquals(3,Lab1.closestFactorToSqrt(1923));
		assertEquals(78,Lab1.closestFactorToSqrt(8892));
		assertEquals(1, Lab1.closestFactorToSqrt(1));
		assertEquals(2, Lab1.closestFactorToSqrt(4));
		assertEquals(2, Lab1.closestFactorToSqrt(10));
		assertEquals(7, Lab1.closestFactorToSqrt(70));
		assertEquals(1, Lab1.closestFactorToSqrt(1427));

	}

}
