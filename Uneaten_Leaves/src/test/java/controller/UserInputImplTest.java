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
	String okCaterpillarsInput1 = "[2,4,5]";
	String wrongCaterpillarsInput = "2-A,5";
	String zeroCaterpillarsInput = "3,0,5";
	int[] okArrayInputResult = {2,4,5};
	int[] wrongArrayInputResult = new int[0];

	@Test
	public void setNumberOfLeavesOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be " + okLeavesInput, okLeavesInputResult, input.numberOfLeaves(okLeavesInput));

	}

	@Test
	public void setNumberOfLeavesWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(wrongLeavesInput));

	}

	@Test
	public void setNumberOfLeavesOutOfBoundsInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertEquals("Must be "+wrongLeavesInputResult, wrongLeavesInputResult, input.numberOfLeaves(outOfBoundsLeavesInput));

	}
	
	@Test
	public void setCaterpilarArrayOkInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(okArrayInputResult, input.caterpillarsPosition(okCaterpillarsInput));
		//assertArrayEquals(okArrayInputResult, input.caterpillarsPosition(okCaterpillarsInput1));
		assertEquals("Must be " + Arrays.toString(okArrayInputResult), Arrays.toString(okArrayInputResult),  Arrays.toString(input.caterpillarsPosition(okCaterpillarsInput)));
	}

	@Test
	public void setCaterpilarArrayWrongInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(wrongCaterpillarsInput));
	}
	
	@Test
	public void setCaterpilarArrayWithZeroInput() throws Exception{
		UserInput input = new UserInputImpl();
		assertArrayEquals(wrongArrayInputResult, input.caterpillarsPosition(zeroCaterpillarsInput));
	}

}
