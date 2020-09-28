package _02_More_Algorithms;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import _01_Searching_Algorithms._00_LinearSearch;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	public static int multiply(int x, int y) {
		return x*y;
	}
	
	@Test
	  public void MultTest() {
	    assertEquals(0, multiply(10, 0));
	    assertEquals(100, multiply(10, 10));
	    assertEquals(88, multiply(8, 11));
	  }
//
	public static boolean isPrime(int x) {
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	public static boolean isSquare(int x) {
		if((int)Math.sqrt(x) == Math.sqrt(x)) {
			return true;
		}
		return false;
	}
	
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	public static boolean isCube(int x) {
		if((int)Math.cbrt(x) == Math.cbrt(x)) {
			return true;
		}
		return false;
	}
	
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
