package controller;

public interface LeavesCounter {
	/**
	 * Calculate number of uneaten leaves - Algorithm is j,j*2,j*3,j*n
	 * where j is first leave witch caterpillar eat
	 * @param leavesNumber number of leaves
	 * @param caterpillarPosition Array of caterpillars
	 * @return number of uneaten leaves
	 */
	int uneatenLeavesCounter(int leavesNumber, int[] caterpillarPosition);

}
