/**
 * 
 */
package controller;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserInputImplTest {

	/**
	 * Correct input  = output
	 * 
	 */
	String okLeavesInput = "10";
	int okLeavesInputResult = 10;

	@Test
	public void setNumberOfLeavesOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be " + okLeavesInput, okLeavesInputResult, input.numberOfLeaves(okLeavesInput));

	}
	
	/**
	 * Case:
	 * Alfabet input
	 * result = -1
	 * Solved!
	 */

	String wrongLeavesInput = "A";
	int wrongLeavesInputResult = -1;
	
	@Test
	public void setNumberOfLeavesWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(wrongLeavesInput));

	}
	
	/**
	 * Case:
	 * Out of bounds leaves input
	 * result -1 
	 * Solved!
	 */
	String outOfBoundsLeavesInput = "110";

	@Test
	public void setNumberOfLeavesOutOfBoundsInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(outOfBoundsLeavesInput));

	}
	
	/**
	 * Case:
	 * Correct caterpillar array input = output
	 * Check both input cases
	 */
	
	String okCaterpillarsInput = "2,4,5";
	String okCaterpillarsInput1 = "[2,4,5]";
	int[] okArrayInputResult = {2,4,5};
	
	@Test
	public void setCaterpilarArrayOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(okArrayInputResult, input.caterpillarsPosition(okCaterpillarsInput));
		assertArrayEquals(okArrayInputResult, input.caterpillarsPosition(okCaterpillarsInput1));
	}
	
	/**
	 * Case:
	 * Array out of bounds ( >15)
	 * return empty array
	 * Solved!
	 */
	
	String outOfBoundsCaterpillarsInput = "3,2,5,4,67,6,8,12,33,67,33,28,90,78,45,32,55,59,98";
	int[] wrongArrayInputResult = new int[0];
	
	@Test
	public void setCaterpilarArrayOutOfBounds() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(outOfBoundsCaterpillarsInput));
	}
	
	/**
	 * Case:
	 * Array contains alphabet and special chars
	 * return empty array
	 * Solved!
	 */

	String wrongCaterpillarsInput = "2-A,5";

	@Test
	public void setCaterpilarArrayWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(wrongCaterpillarsInput));
	}
	
	/**
	 * Case:
	 * Array contains zero
	 * return empty array
	 * Solved!
	 */
	
	String zeroCaterpillarsInput = "3,0,5";
	
	@Test
	public void setCaterpilarArrayWithZeroInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(zeroCaterpillarsInput));
	}

}
