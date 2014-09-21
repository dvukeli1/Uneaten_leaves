/**
 * 
 */
package controller;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import controller.UserInput;

public class UserInputImplTest {

	String okLeavesInput = "10";
	String outOfBoundsLeavesInput = "110";
	String wrongLeavesInput = "A";
	int okLeavesInputResult = 10;
	int wrongLeavesInputResult = -1;
	
	String okCaterpillarsInput = "2,4,5";	
	String wrongCaterpillarsInput = "2-A,5";
	String zeroCaterpillarsInput = "3,0,5";
	int[] okArrayInputResult = {2,4,5};
	int[] wrongArrayInputResult = new int[0];

	@Test
	public void getNumberOfLeavesOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be " + okLeavesInput, okLeavesInputResult, input.numberOfLeaves(okLeavesInput));

	}

	@Test
	public void getNumberOfLeavesWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(wrongLeavesInput));

	}

	@Test
	public void getNumberOfLeavesOutOfBoundsInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(outOfBoundsLeavesInput));

	}
	
	@Test
	public void getCaterpilarArrayOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(okArrayInputResult, input.caterpillarsPosition(okCaterpillarsInput));
		assertEquals("Must be " + Arrays.toString(okArrayInputResult), Arrays.toString(okArrayInputResult),  Arrays.toString(input.caterpillarsPosition(okCaterpillarsInput)));
	}

	@Test
	public void getCaterpilarArrayWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(wrongCaterpillarsInput));
	}
	
	@Test
	public void getCaterpilarArrayWithZeroInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(zeroCaterpillarsInput));
	}

}
