package controller;

import java.util.ArrayList;
import java.util.List;

import controller.LeavesCounter;

public class LeavesCounterImpl implements LeavesCounter {

	int uneatenLeaves = 0;
	List<Integer> eatenLeaves = new ArrayList<Integer>();
	int multiplier = 1;
	int eaten = 0;

	public int uneatenLeavesCounter(int leavesNumber, int[] caterpillarArray) {
		for (int leaf : caterpillarArray) {
			eaten = leaf ;
			while (eaten <= leavesNumber) {
				if (eatenLeaves.isEmpty() || (!eatenLeaves.contains(eaten) && eaten <= leavesNumber)) {
					eatenLeaves.add(eaten);
					multiplier++;
					eaten = leaf * multiplier;
				} else {
					multiplier++;
					eaten = leaf * multiplier;
				}
			}
			multiplier = 1;
		}
		uneatenLeaves = leavesNumber - (eatenLeaves.size());
		return uneatenLeaves;
	}

}
