package controller;


import java.util.ArrayList;
import java.util.List;

import controller.LeavesCounter;

public class LeavesCounterImpl implements LeavesCounter{

	int uneatenLeaves = 0;
	List<Integer> eatenLeaves = new ArrayList<Integer>();
	int multiplier = 1;
	int eaten = 0;

	public int uneatenLeavesCounter(int N, int[] j) {
		for (int a : j){
			eaten = a * multiplier;
			while (eaten <= N){
				if(eatenLeaves.isEmpty() || (!eatenLeaves.contains(eaten) && eaten <= N)){
					eatenLeaves.add(eaten);
					multiplier++;
					eaten = a*multiplier;
				}
				else{
					multiplier++;
					eaten = a*multiplier;
				}
			}
			multiplier = 1;
		}
		uneatenLeaves = N - (eatenLeaves.size());
		return uneatenLeaves;
	}

}
