package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
			//3. return number 
		
		//4. else return number + recursionMultiplication(number, times-1)
		
		if(times == 1) {
			return number;
		}
		
		else {
			return number + recursiveMultiplication(number, times-1);
		}
		
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		return 0;
		
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		return 0;
		
	}
	
	
	
	@Test
	void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(0, recursiveMultiplication(0, 163));
		assertEquals(34, recursiveMultiplication(17, 2));
		assertEquals(-12, recursiveMultiplication(-3, 4));
		assertEquals(19, recursiveMultiplication(1, 19));
	}
	
	
	@Test
	void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(19, recursiveDivision(1, 19));
		assertEquals(19, recursiveDivision(1, 19));
		assertEquals(19, recursiveDivision(1, 19));
		assertEquals(19, recursiveDivision(1, 19));
		assertEquals(19, recursiveDivision(1, 19));
	}
	
	
	@Test 
	void testPower() {
		//7  Add JUnit tests to test your method
	
	}
	
}
