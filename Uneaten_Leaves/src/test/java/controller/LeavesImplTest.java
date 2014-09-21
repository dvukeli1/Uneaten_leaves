package controller;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.LeavesCounter;

public class LeavesImplTest{

	int[] j = {34,22,3,11,45,67,9,11};
	int N = 109;
	int okResult = 64;
	
	@Test
	public void UneatenLeavesTest() {
		LeavesCounter leavesCount = new LeavesCounterImpl();
		assertEquals("Must be "+ okResult, okResult, leavesCount.uneatenLeavesCounter(N, j));
		
	}

}
