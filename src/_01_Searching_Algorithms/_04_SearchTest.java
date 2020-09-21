package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String words[] = {"Ant", "Bear", "Cat", "Dog", "Emu"};
		assertEquals(2, _00_LinearSearch.linearSearch(words, "Cat"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "Fish"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "Ant"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "Emu"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(3, _01_BinarySearch.binarySearch(array, 0, array.length-1, 4));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, array.length-1, 0));
		assertEquals(0, _01_BinarySearch.binarySearch(array, 0, array.length-1, 1));
		assertEquals(8, _01_BinarySearch.binarySearch(array, 0, array.length-1, 9));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(array, 4));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 0));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(array, 1));
		assertEquals(8, _02_InterpolationSearch.interpolationSearch(array, 9));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(array, 4));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 0));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array, 1));
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(array, 9));
	}
}
